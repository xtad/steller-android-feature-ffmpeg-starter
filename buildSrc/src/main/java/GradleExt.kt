import org.gradle.api.Project
import java.util.*

fun getStringProperty(project: Project, propertyArg: String, defaultValue: String): String {
    return project.getPropertyValue(propertyArg, defaultValue)
}

private fun <T> Project.getPropertyValue(propertyArg: String, defaultValue: T): String {
    var value: String? = null

    project.rootProject.run {
        // task argument -PversionCode=... (do not need atm)
        if (hasProperty(propertyArg)) {
            property(propertyArg)?.let { value = it.toString() }
        }

        // local.properties
        val localPropertiesFile = file(LOCAL_PROPERTIES)

        if (value == null && localPropertiesFile.canRead()) {
            val properties = Properties().apply {
                load(localPropertiesFile.inputStream())
            }

            value = properties.getProperty(propertyArg)
        }
    }

    // global gradle.properties
    if (value == null) {
        value = project.findProperty(propertyArg)?.toString()
    }

    return value ?: defaultValue.toString()
}

fun getStellerCiGoogleServiceKey(project: Project): String {
    return getStringProperty(project, STELLER_CI_SERVICE_KEY_ARG, "")
}

const val ENV_ARG_KEYSTORE_FILE = "KEYSTORE_FILE"
const val ENV_ARG_STORE_PASSWORD = "STORE_PASSWORD"
const val ENV_ARG_KEY_ALIAS = "KEY_ALIAS"
const val ENV_ARG_KEY_PASSWORD = "KEY_PASSWORD"
const val ENV_ARG_GOOGLE_CI_SERVICE_ACCOUNT = "GOOGLE_CI_SERVICE_ACCOUNT"
const val ENV_ARG_BUILD_VERSION_CODE = "BUILD_VERSION_CODE"
const val ENV_ARG_VERSION_CODE_OFFSET = "VERSION_CODE_OFFSET"

private const val LOCAL_PROPERTIES = "local.properties"

private const val STELLER_CI_SERVICE_KEY_ARG = "steller_ci_google_service_key"
