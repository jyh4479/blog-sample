rootProject.name = "spring-cloud"

include("config-server")
include("eureka-server")
include("hystrix-server")
include("zuul-server")
include("zipkin-server")

include("licensing-service")
include("organization-service")

pluginManagement {

    val pluginVersions = mapOf(
        "org.jetbrains.kotlin" to "1.3.72",
        "org.jetbrains.kotlin.plugin" to "1.3.72",
        "org.springframework" to "2.3.2.RELEASE",
        "io.spring" to "1.0.9.RELEASE"
    )

    resolutionStrategy {
        eachPlugin {
            if (pluginVersions.containsKey(requested.id.namespace)) {
                useVersion(pluginVersions[requested.id.namespace])
            }
        }
    }
}