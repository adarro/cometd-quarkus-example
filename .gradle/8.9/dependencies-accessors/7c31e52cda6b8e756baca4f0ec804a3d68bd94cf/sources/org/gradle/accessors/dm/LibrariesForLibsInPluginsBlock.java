package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final JakartaLibraryAccessors laccForJakartaLibraryAccessors = new JakartaLibraryAccessors(owner);
    private final OrgLibraryAccessors laccForOrgLibraryAccessors = new OrgLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Group of libraries at <b>io</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public IoLibraryAccessors getIo() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForIoLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jakarta</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JakartaLibraryAccessors getJakarta() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJakartaLibraryAccessors;
    }

    /**
     * Group of libraries at <b>org</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public OrgLibraryAccessors getOrg() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForOrgLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     *
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoQuarkusLibraryAccessors laccForIoQuarkusLibraryAccessors = new IoQuarkusLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.quarkus</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQuarkusLibraryAccessors getQuarkus() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQuarkusLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoQuarkusLibraryAccessors extends SubDependencyFactory {
        private final IoQuarkusQuarkusLibraryAccessors laccForIoQuarkusQuarkusLibraryAccessors = new IoQuarkusQuarkusLibraryAccessors(owner);

        public IoQuarkusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.quarkus.quarkus</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public IoQuarkusQuarkusLibraryAccessors getQuarkus() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForIoQuarkusQuarkusLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class IoQuarkusQuarkusLibraryAccessors extends SubDependencyFactory {

        public IoQuarkusQuarkusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>arc</b> with <b>io.quarkus:quarkus-arc</b> coordinates and
         * with version reference <b>io.quarkus.quarkus.arc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getArc() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.quarkus.quarkus.arc");
        }

        /**
         * Dependency provider for <b>junit5</b> with <b>io.quarkus:quarkus-junit5</b> coordinates and
         * with version reference <b>io.quarkus.quarkus.junit5</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJunit5() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.quarkus.quarkus.junit5");
        }

        /**
         * Dependency provider for <b>undertow</b> with <b>io.quarkus:quarkus-undertow</b> coordinates and
         * with version reference <b>io.quarkus.quarkus.undertow</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getUndertow() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("io.quarkus.quarkus.undertow");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletLibraryAccessors laccForJakartaServletLibraryAccessors = new JakartaServletLibraryAccessors(owner);

        public JakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.servlet</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletLibraryAccessors getServlet() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJakartaLibraryAccessors laccForJakartaServletJakartaLibraryAccessors = new JakartaServletJakartaLibraryAccessors(owner);

        public JakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.servlet.jakarta</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJakartaLibraryAccessors getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJakartaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJakartaLibraryAccessors extends SubDependencyFactory {
        private final JakartaServletJakartaServletLibraryAccessors laccForJakartaServletJakartaServletLibraryAccessors = new JakartaServletJakartaServletLibraryAccessors(owner);

        public JakartaServletJakartaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>jakarta.servlet.jakarta.servlet</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public JakartaServletJakartaServletLibraryAccessors getServlet() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForJakartaServletJakartaServletLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JakartaServletJakartaServletLibraryAccessors extends SubDependencyFactory {

        public JakartaServletJakartaServletLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>jakarta.servlet:jakarta.servlet-api</b> coordinates and
         * with version reference <b>jakarta.servlet.jakarta.servlet.api</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("jakarta.servlet.jakarta.servlet.api");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdLibraryAccessors laccForOrgCometdLibraryAccessors = new OrgCometdLibraryAccessors(owner);
        private final OrgEclipseLibraryAccessors laccForOrgEclipseLibraryAccessors = new OrgEclipseLibraryAccessors(owner);

        public OrgLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdLibraryAccessors getCometd() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.eclipse</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseLibraryAccessors getEclipse() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdJavaLibraryAccessors laccForOrgCometdJavaLibraryAccessors = new OrgCometdJavaLibraryAccessors(owner);
        private final OrgCometdJavascriptLibraryAccessors laccForOrgCometdJavascriptLibraryAccessors = new OrgCometdJavascriptLibraryAccessors(owner);

        public OrgCometdLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd.java</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavaLibraryAccessors getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavaLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.cometd.javascript</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavascriptLibraryAccessors getJavascript() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavascriptLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavaLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdJavaCometdLibraryAccessors laccForOrgCometdJavaCometdLibraryAccessors = new OrgCometdJavaCometdLibraryAccessors(owner);

        public OrgCometdJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd.java.cometd</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavaCometdLibraryAccessors getCometd() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavaCometdLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavaCometdLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdJavaCometdJavaLibraryAccessors laccForOrgCometdJavaCometdJavaLibraryAccessors = new OrgCometdJavaCometdJavaLibraryAccessors(owner);

        public OrgCometdJavaCometdLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd.java.cometd.java</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavaCometdJavaLibraryAccessors getJava() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavaCometdJavaLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavaCometdJavaLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdJavaCometdJavaApiLibraryAccessors laccForOrgCometdJavaCometdJavaApiLibraryAccessors = new OrgCometdJavaCometdJavaApiLibraryAccessors(owner);
        private final OrgCometdJavaCometdJavaServerLibraryAccessors laccForOrgCometdJavaCometdJavaServerLibraryAccessors = new OrgCometdJavaCometdJavaServerLibraryAccessors(owner);

        public OrgCometdJavaCometdJavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd.java.cometd.java.api</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavaCometdJavaApiLibraryAccessors getApi() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavaCometdJavaApiLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.cometd.java.cometd.java.server</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavaCometdJavaServerLibraryAccessors getServer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavaCometdJavaServerLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavaCometdJavaApiLibraryAccessors extends SubDependencyFactory {

        public OrgCometdJavaCometdJavaApiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>server</b> with <b>org.cometd.java:cometd-java-api-server</b> coordinates and
         * with version reference <b>org.cometd.java.cometd.java.api.server</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getServer() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.cometd.java.cometd.java.api.server");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavaCometdJavaServerLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdJavaCometdJavaServerHttpLibraryAccessors laccForOrgCometdJavaCometdJavaServerHttpLibraryAccessors = new OrgCometdJavaCometdJavaServerHttpLibraryAccessors(owner);
        private final OrgCometdJavaCometdJavaServerWebsocketLibraryAccessors laccForOrgCometdJavaCometdJavaServerWebsocketLibraryAccessors = new OrgCometdJavaCometdJavaServerWebsocketLibraryAccessors(owner);

        public OrgCometdJavaCometdJavaServerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd.java.cometd.java.server.http</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavaCometdJavaServerHttpLibraryAccessors getHttp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavaCometdJavaServerHttpLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.cometd.java.cometd.java.server.websocket</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavaCometdJavaServerWebsocketLibraryAccessors getWebsocket() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavaCometdJavaServerWebsocketLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavaCometdJavaServerHttpLibraryAccessors extends SubDependencyFactory {

        public OrgCometdJavaCometdJavaServerHttpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jakarta</b> with <b>org.cometd.java:cometd-java-server-http-jakarta</b> coordinates and
         * with version reference <b>org.cometd.java.cometd.java.server.http.jakarta</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.cometd.java.cometd.java.server.http.jakarta");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavaCometdJavaServerWebsocketLibraryAccessors extends SubDependencyFactory {

        public OrgCometdJavaCometdJavaServerWebsocketLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jakarta</b> with <b>org.cometd.java:cometd-java-server-websocket-jakarta</b> coordinates and
         * with version reference <b>org.cometd.java.cometd.java.server.websocket.jakarta</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJakarta() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.cometd.java.cometd.java.server.websocket.jakarta");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavascriptLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdJavascriptCometdLibraryAccessors laccForOrgCometdJavascriptCometdLibraryAccessors = new OrgCometdJavascriptCometdLibraryAccessors(owner);

        public OrgCometdJavascriptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd.javascript.cometd</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavascriptCometdLibraryAccessors getCometd() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavascriptCometdLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavascriptCometdLibraryAccessors extends SubDependencyFactory {
        private final OrgCometdJavascriptCometdJavascriptLibraryAccessors laccForOrgCometdJavascriptCometdJavascriptLibraryAccessors = new OrgCometdJavascriptCometdJavascriptLibraryAccessors(owner);

        public OrgCometdJavascriptCometdLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.cometd.javascript.cometd.javascript</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgCometdJavascriptCometdJavascriptLibraryAccessors getJavascript() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgCometdJavascriptCometdJavascriptLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgCometdJavascriptCometdJavascriptLibraryAccessors extends SubDependencyFactory {

        public OrgCometdJavascriptCometdJavascriptLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>common</b> with <b>org.cometd.javascript:cometd-javascript-common</b> coordinates and
         * with version reference <b>org.cometd.javascript.cometd.javascript.common</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getCommon() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.cometd.javascript.cometd.javascript.common");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseJettyLibraryAccessors laccForOrgEclipseJettyLibraryAccessors = new OrgEclipseJettyLibraryAccessors(owner);

        public OrgEclipseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.jetty</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseJettyLibraryAccessors getJetty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseJettyLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseJettyLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseJettyEe10LibraryAccessors laccForOrgEclipseJettyEe10LibraryAccessors = new OrgEclipseJettyEe10LibraryAccessors(owner);
        private final OrgEclipseJettyJettyLibraryAccessors laccForOrgEclipseJettyJettyLibraryAccessors = new OrgEclipseJettyJettyLibraryAccessors(owner);

        public OrgEclipseJettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.jetty.ee10</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseJettyEe10LibraryAccessors getEe10() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseJettyEe10LibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.eclipse.jetty.jetty</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseJettyJettyLibraryAccessors getJetty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseJettyJettyLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseJettyEe10LibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseJettyEe10JettyLibraryAccessors laccForOrgEclipseJettyEe10JettyLibraryAccessors = new OrgEclipseJettyEe10JettyLibraryAccessors(owner);

        public OrgEclipseJettyEe10LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.jetty.ee10.jetty</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseJettyEe10JettyLibraryAccessors getJetty() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseJettyEe10JettyLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseJettyEe10JettyLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseJettyEe10JettyEe10LibraryAccessors laccForOrgEclipseJettyEe10JettyEe10LibraryAccessors = new OrgEclipseJettyEe10JettyEe10LibraryAccessors(owner);

        public OrgEclipseJettyEe10JettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>org.eclipse.jetty.ee10.jetty.ee10</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseJettyEe10JettyEe10LibraryAccessors getEe10() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseJettyEe10JettyEe10LibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseJettyEe10JettyEe10LibraryAccessors extends SubDependencyFactory {

        public OrgEclipseJettyEe10JettyEe10LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>servlets</b> with <b>org.eclipse.jetty.ee10:jetty-ee10-servlets</b> coordinates and
         * with version reference <b>org.eclipse.jetty.ee10.jetty.ee10.servlets</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getServlets() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.eclipse.jetty.ee10.jetty.ee10.servlets");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseJettyJettyLibraryAccessors extends SubDependencyFactory {
        private final OrgEclipseJettyJettySlf4jLibraryAccessors laccForOrgEclipseJettyJettySlf4jLibraryAccessors = new OrgEclipseJettyJettySlf4jLibraryAccessors(owner);
        private final OrgEclipseJettyJettyUtilLibraryAccessors laccForOrgEclipseJettyJettyUtilLibraryAccessors = new OrgEclipseJettyJettyUtilLibraryAccessors(owner);

        public OrgEclipseJettyJettyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>jmx</b> with <b>org.eclipse.jetty:jetty-jmx</b> coordinates and
         * with version reference <b>org.eclipse.jetty.jetty.jmx</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getJmx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.eclipse.jetty.jetty.jmx");
        }

        /**
         * Group of libraries at <b>org.eclipse.jetty.jetty.slf4j</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseJettyJettySlf4jLibraryAccessors getSlf4j() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseJettyJettySlf4jLibraryAccessors;
        }

        /**
         * Group of libraries at <b>org.eclipse.jetty.jetty.util</b>
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public OrgEclipseJettyJettyUtilLibraryAccessors getUtil() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForOrgEclipseJettyJettyUtilLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseJettyJettySlf4jLibraryAccessors extends SubDependencyFactory {

        public OrgEclipseJettyJettySlf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>impl</b> with <b>org.eclipse.jetty:jetty-slf4j-impl</b> coordinates and
         * with version reference <b>org.eclipse.jetty.jetty.slf4j.impl</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getImpl() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.eclipse.jetty.jetty.slf4j.impl");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OrgEclipseJettyJettyUtilLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public OrgEclipseJettyJettyUtilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>util</b> with <b>org.eclipse.jetty:jetty-util</b> coordinates and
         * with version reference <b>org.eclipse.jetty.jetty.util</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.eclipse.jetty.jetty.util");
        }

        /**
         * Dependency provider for <b>ajax</b> with <b>org.eclipse.jetty:jetty-util-ajax</b> coordinates and
         * with version reference <b>org.eclipse.jetty.jetty.util.ajax</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         *
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public Provider<MinimalExternalModuleDependency> getAjax() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("org.eclipse.jetty.jetty.util.ajax");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final IoVersionAccessors vaccForIoVersionAccessors = new IoVersionAccessors(providers, config);
        private final JakartaVersionAccessors vaccForJakartaVersionAccessors = new JakartaVersionAccessors(providers, config);
        private final OrgVersionAccessors vaccForOrgVersionAccessors = new OrgVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io</b>
         */
        public IoVersionAccessors getIo() {
            return vaccForIoVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.jakarta</b>
         */
        public JakartaVersionAccessors getJakarta() {
            return vaccForJakartaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org</b>
         */
        public OrgVersionAccessors getOrg() {
            return vaccForOrgVersionAccessors;
        }

    }

    public static class IoVersionAccessors extends VersionFactory  {

        private final IoQuarkusVersionAccessors vaccForIoQuarkusVersionAccessors = new IoQuarkusVersionAccessors(providers, config);
        public IoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.quarkus</b>
         */
        public IoQuarkusVersionAccessors getQuarkus() {
            return vaccForIoQuarkusVersionAccessors;
        }

    }

    public static class IoQuarkusVersionAccessors extends VersionFactory  {

        private final IoQuarkusQuarkusVersionAccessors vaccForIoQuarkusQuarkusVersionAccessors = new IoQuarkusQuarkusVersionAccessors(providers, config);
        public IoQuarkusVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io.quarkus.quarkus</b>
         */
        public IoQuarkusQuarkusVersionAccessors getQuarkus() {
            return vaccForIoQuarkusQuarkusVersionAccessors;
        }

    }

    public static class IoQuarkusQuarkusVersionAccessors extends VersionFactory  {

        public IoQuarkusQuarkusVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>io.quarkus.quarkus.arc</b> with value <b>3.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getArc() { return getVersion("io.quarkus.quarkus.arc"); }

        /**
         * Version alias <b>io.quarkus.quarkus.junit5</b> with value <b>3.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit5() { return getVersion("io.quarkus.quarkus.junit5"); }

        /**
         * Version alias <b>io.quarkus.quarkus.undertow</b> with value <b>3.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getUndertow() { return getVersion("io.quarkus.quarkus.undertow"); }

    }

    public static class JakartaVersionAccessors extends VersionFactory  {

        private final JakartaServletVersionAccessors vaccForJakartaServletVersionAccessors = new JakartaServletVersionAccessors(providers, config);
        public JakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.servlet</b>
         */
        public JakartaServletVersionAccessors getServlet() {
            return vaccForJakartaServletVersionAccessors;
        }

    }

    public static class JakartaServletVersionAccessors extends VersionFactory  {

        private final JakartaServletJakartaVersionAccessors vaccForJakartaServletJakartaVersionAccessors = new JakartaServletJakartaVersionAccessors(providers, config);
        public JakartaServletVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.servlet.jakarta</b>
         */
        public JakartaServletJakartaVersionAccessors getJakarta() {
            return vaccForJakartaServletJakartaVersionAccessors;
        }

    }

    public static class JakartaServletJakartaVersionAccessors extends VersionFactory  {

        private final JakartaServletJakartaServletVersionAccessors vaccForJakartaServletJakartaServletVersionAccessors = new JakartaServletJakartaServletVersionAccessors(providers, config);
        public JakartaServletJakartaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.jakarta.servlet.jakarta.servlet</b>
         */
        public JakartaServletJakartaServletVersionAccessors getServlet() {
            return vaccForJakartaServletJakartaServletVersionAccessors;
        }

    }

    public static class JakartaServletJakartaServletVersionAccessors extends VersionFactory  {

        public JakartaServletJakartaServletVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>jakarta.servlet.jakarta.servlet.api</b> with value <b>6.0.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getApi() { return getVersion("jakarta.servlet.jakarta.servlet.api"); }

    }

    public static class OrgVersionAccessors extends VersionFactory  {

        private final OrgCometdVersionAccessors vaccForOrgCometdVersionAccessors = new OrgCometdVersionAccessors(providers, config);
        private final OrgEclipseVersionAccessors vaccForOrgEclipseVersionAccessors = new OrgEclipseVersionAccessors(providers, config);
        public OrgVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd</b>
         */
        public OrgCometdVersionAccessors getCometd() {
            return vaccForOrgCometdVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.eclipse</b>
         */
        public OrgEclipseVersionAccessors getEclipse() {
            return vaccForOrgEclipseVersionAccessors;
        }

    }

    public static class OrgCometdVersionAccessors extends VersionFactory  {

        private final OrgCometdJavaVersionAccessors vaccForOrgCometdJavaVersionAccessors = new OrgCometdJavaVersionAccessors(providers, config);
        private final OrgCometdJavascriptVersionAccessors vaccForOrgCometdJavascriptVersionAccessors = new OrgCometdJavascriptVersionAccessors(providers, config);
        public OrgCometdVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd.java</b>
         */
        public OrgCometdJavaVersionAccessors getJava() {
            return vaccForOrgCometdJavaVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.cometd.javascript</b>
         */
        public OrgCometdJavascriptVersionAccessors getJavascript() {
            return vaccForOrgCometdJavascriptVersionAccessors;
        }

    }

    public static class OrgCometdJavaVersionAccessors extends VersionFactory  {

        private final OrgCometdJavaCometdVersionAccessors vaccForOrgCometdJavaCometdVersionAccessors = new OrgCometdJavaCometdVersionAccessors(providers, config);
        public OrgCometdJavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd.java.cometd</b>
         */
        public OrgCometdJavaCometdVersionAccessors getCometd() {
            return vaccForOrgCometdJavaCometdVersionAccessors;
        }

    }

    public static class OrgCometdJavaCometdVersionAccessors extends VersionFactory  {

        private final OrgCometdJavaCometdJavaVersionAccessors vaccForOrgCometdJavaCometdJavaVersionAccessors = new OrgCometdJavaCometdJavaVersionAccessors(providers, config);
        public OrgCometdJavaCometdVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd.java.cometd.java</b>
         */
        public OrgCometdJavaCometdJavaVersionAccessors getJava() {
            return vaccForOrgCometdJavaCometdJavaVersionAccessors;
        }

    }

    public static class OrgCometdJavaCometdJavaVersionAccessors extends VersionFactory  {

        private final OrgCometdJavaCometdJavaApiVersionAccessors vaccForOrgCometdJavaCometdJavaApiVersionAccessors = new OrgCometdJavaCometdJavaApiVersionAccessors(providers, config);
        private final OrgCometdJavaCometdJavaServerVersionAccessors vaccForOrgCometdJavaCometdJavaServerVersionAccessors = new OrgCometdJavaCometdJavaServerVersionAccessors(providers, config);
        public OrgCometdJavaCometdJavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd.java.cometd.java.api</b>
         */
        public OrgCometdJavaCometdJavaApiVersionAccessors getApi() {
            return vaccForOrgCometdJavaCometdJavaApiVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.cometd.java.cometd.java.server</b>
         */
        public OrgCometdJavaCometdJavaServerVersionAccessors getServer() {
            return vaccForOrgCometdJavaCometdJavaServerVersionAccessors;
        }

    }

    public static class OrgCometdJavaCometdJavaApiVersionAccessors extends VersionFactory  {

        public OrgCometdJavaCometdJavaApiVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.cometd.java.cometd.java.api.server</b> with value <b>8.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getServer() { return getVersion("org.cometd.java.cometd.java.api.server"); }

    }

    public static class OrgCometdJavaCometdJavaServerVersionAccessors extends VersionFactory  {

        private final OrgCometdJavaCometdJavaServerHttpVersionAccessors vaccForOrgCometdJavaCometdJavaServerHttpVersionAccessors = new OrgCometdJavaCometdJavaServerHttpVersionAccessors(providers, config);
        private final OrgCometdJavaCometdJavaServerWebsocketVersionAccessors vaccForOrgCometdJavaCometdJavaServerWebsocketVersionAccessors = new OrgCometdJavaCometdJavaServerWebsocketVersionAccessors(providers, config);
        public OrgCometdJavaCometdJavaServerVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd.java.cometd.java.server.http</b>
         */
        public OrgCometdJavaCometdJavaServerHttpVersionAccessors getHttp() {
            return vaccForOrgCometdJavaCometdJavaServerHttpVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.cometd.java.cometd.java.server.websocket</b>
         */
        public OrgCometdJavaCometdJavaServerWebsocketVersionAccessors getWebsocket() {
            return vaccForOrgCometdJavaCometdJavaServerWebsocketVersionAccessors;
        }

    }

    public static class OrgCometdJavaCometdJavaServerHttpVersionAccessors extends VersionFactory  {

        public OrgCometdJavaCometdJavaServerHttpVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.cometd.java.cometd.java.server.http.jakarta</b> with value <b>8.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakarta() { return getVersion("org.cometd.java.cometd.java.server.http.jakarta"); }

    }

    public static class OrgCometdJavaCometdJavaServerWebsocketVersionAccessors extends VersionFactory  {

        public OrgCometdJavaCometdJavaServerWebsocketVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.cometd.java.cometd.java.server.websocket.jakarta</b> with value <b>8.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJakarta() { return getVersion("org.cometd.java.cometd.java.server.websocket.jakarta"); }

    }

    public static class OrgCometdJavascriptVersionAccessors extends VersionFactory  {

        private final OrgCometdJavascriptCometdVersionAccessors vaccForOrgCometdJavascriptCometdVersionAccessors = new OrgCometdJavascriptCometdVersionAccessors(providers, config);
        public OrgCometdJavascriptVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd.javascript.cometd</b>
         */
        public OrgCometdJavascriptCometdVersionAccessors getCometd() {
            return vaccForOrgCometdJavascriptCometdVersionAccessors;
        }

    }

    public static class OrgCometdJavascriptCometdVersionAccessors extends VersionFactory  {

        private final OrgCometdJavascriptCometdJavascriptVersionAccessors vaccForOrgCometdJavascriptCometdJavascriptVersionAccessors = new OrgCometdJavascriptCometdJavascriptVersionAccessors(providers, config);
        public OrgCometdJavascriptCometdVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.cometd.javascript.cometd.javascript</b>
         */
        public OrgCometdJavascriptCometdJavascriptVersionAccessors getJavascript() {
            return vaccForOrgCometdJavascriptCometdJavascriptVersionAccessors;
        }

    }

    public static class OrgCometdJavascriptCometdJavascriptVersionAccessors extends VersionFactory  {

        public OrgCometdJavascriptCometdJavascriptVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.cometd.javascript.cometd.javascript.common</b> with value <b>8.0.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCommon() { return getVersion("org.cometd.javascript.cometd.javascript.common"); }

    }

    public static class OrgEclipseVersionAccessors extends VersionFactory  {

        private final OrgEclipseJettyVersionAccessors vaccForOrgEclipseJettyVersionAccessors = new OrgEclipseJettyVersionAccessors(providers, config);
        public OrgEclipseVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.jetty</b>
         */
        public OrgEclipseJettyVersionAccessors getJetty() {
            return vaccForOrgEclipseJettyVersionAccessors;
        }

    }

    public static class OrgEclipseJettyVersionAccessors extends VersionFactory  {

        private final OrgEclipseJettyEe10VersionAccessors vaccForOrgEclipseJettyEe10VersionAccessors = new OrgEclipseJettyEe10VersionAccessors(providers, config);
        private final OrgEclipseJettyJettyVersionAccessors vaccForOrgEclipseJettyJettyVersionAccessors = new OrgEclipseJettyJettyVersionAccessors(providers, config);
        public OrgEclipseJettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.jetty.ee10</b>
         */
        public OrgEclipseJettyEe10VersionAccessors getEe10() {
            return vaccForOrgEclipseJettyEe10VersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.eclipse.jetty.jetty</b>
         */
        public OrgEclipseJettyJettyVersionAccessors getJetty() {
            return vaccForOrgEclipseJettyJettyVersionAccessors;
        }

    }

    public static class OrgEclipseJettyEe10VersionAccessors extends VersionFactory  {

        private final OrgEclipseJettyEe10JettyVersionAccessors vaccForOrgEclipseJettyEe10JettyVersionAccessors = new OrgEclipseJettyEe10JettyVersionAccessors(providers, config);
        public OrgEclipseJettyEe10VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.jetty.ee10.jetty</b>
         */
        public OrgEclipseJettyEe10JettyVersionAccessors getJetty() {
            return vaccForOrgEclipseJettyEe10JettyVersionAccessors;
        }

    }

    public static class OrgEclipseJettyEe10JettyVersionAccessors extends VersionFactory  {

        private final OrgEclipseJettyEe10JettyEe10VersionAccessors vaccForOrgEclipseJettyEe10JettyEe10VersionAccessors = new OrgEclipseJettyEe10JettyEe10VersionAccessors(providers, config);
        public OrgEclipseJettyEe10JettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.org.eclipse.jetty.ee10.jetty.ee10</b>
         */
        public OrgEclipseJettyEe10JettyEe10VersionAccessors getEe10() {
            return vaccForOrgEclipseJettyEe10JettyEe10VersionAccessors;
        }

    }

    public static class OrgEclipseJettyEe10JettyEe10VersionAccessors extends VersionFactory  {

        public OrgEclipseJettyEe10JettyEe10VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.eclipse.jetty.ee10.jetty.ee10.servlets</b> with value <b>12.0.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getServlets() { return getVersion("org.eclipse.jetty.ee10.jetty.ee10.servlets"); }

    }

    public static class OrgEclipseJettyJettyVersionAccessors extends VersionFactory  {

        private final OrgEclipseJettyJettySlf4jVersionAccessors vaccForOrgEclipseJettyJettySlf4jVersionAccessors = new OrgEclipseJettyJettySlf4jVersionAccessors(providers, config);
        private final OrgEclipseJettyJettyUtilVersionAccessors vaccForOrgEclipseJettyJettyUtilVersionAccessors = new OrgEclipseJettyJettyUtilVersionAccessors(providers, config);
        public OrgEclipseJettyJettyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.eclipse.jetty.jetty.jmx</b> with value <b>12.0.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJmx() { return getVersion("org.eclipse.jetty.jetty.jmx"); }

        /**
         * Group of versions at <b>versions.org.eclipse.jetty.jetty.slf4j</b>
         */
        public OrgEclipseJettyJettySlf4jVersionAccessors getSlf4j() {
            return vaccForOrgEclipseJettyJettySlf4jVersionAccessors;
        }

        /**
         * Group of versions at <b>versions.org.eclipse.jetty.jetty.util</b>
         */
        public OrgEclipseJettyJettyUtilVersionAccessors getUtil() {
            return vaccForOrgEclipseJettyJettyUtilVersionAccessors;
        }

    }

    public static class OrgEclipseJettyJettySlf4jVersionAccessors extends VersionFactory  {

        public OrgEclipseJettyJettySlf4jVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.eclipse.jetty.jetty.slf4j.impl</b> with value <b>12.0.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getImpl() { return getVersion("org.eclipse.jetty.jetty.slf4j.impl"); }

    }

    public static class OrgEclipseJettyJettyUtilVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public OrgEclipseJettyJettyUtilVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>org.eclipse.jetty.jetty.util</b> with value <b>12.0.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("org.eclipse.jetty.jetty.util"); }

        /**
         * Version alias <b>org.eclipse.jetty.jetty.util.ajax</b> with value <b>12.0.10</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAjax() { return getVersion("org.eclipse.jetty.jetty.util.ajax"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
