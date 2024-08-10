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
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final IoLibraryAccessors laccForIoLibraryAccessors = new IoLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Group of libraries at <b>io</b>
     */
    public IoLibraryAccessors getIo() {
        return laccForIoLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class IoLibraryAccessors extends SubDependencyFactory {
        private final IoQuarkusLibraryAccessors laccForIoQuarkusLibraryAccessors = new IoQuarkusLibraryAccessors(owner);

        public IoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.quarkus</b>
         */
        public IoQuarkusLibraryAccessors getQuarkus() {
            return laccForIoQuarkusLibraryAccessors;
        }

    }

    public static class IoQuarkusLibraryAccessors extends SubDependencyFactory {
        private final IoQuarkusQuarkusLibraryAccessors laccForIoQuarkusQuarkusLibraryAccessors = new IoQuarkusQuarkusLibraryAccessors(owner);

        public IoQuarkusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Group of libraries at <b>io.quarkus.quarkus</b>
         */
        public IoQuarkusQuarkusLibraryAccessors getQuarkus() {
            return laccForIoQuarkusQuarkusLibraryAccessors;
        }

    }

    public static class IoQuarkusQuarkusLibraryAccessors extends SubDependencyFactory {

        public IoQuarkusQuarkusLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>arc</b> with <b>io.quarkus:quarkus-arc</b> coordinates and
         * with version reference <b>io.quarkus.quarkus.arc</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getArc() {
            return create("io.quarkus.quarkus.arc");
        }

        /**
         * Dependency provider for <b>junit5</b> with <b>io.quarkus:quarkus-junit5</b> coordinates and
         * with version reference <b>io.quarkus.quarkus.junit5</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunit5() {
            return create("io.quarkus.quarkus.junit5");
        }

        /**
         * Dependency provider for <b>undertow</b> with <b>io.quarkus:quarkus-undertow</b> coordinates and
         * with version reference <b>io.quarkus.quarkus.undertow</b>
         * <p>
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUndertow() {
            return create("io.quarkus.quarkus.undertow");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final IoVersionAccessors vaccForIoVersionAccessors = new IoVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Group of versions at <b>versions.io</b>
         */
        public IoVersionAccessors getIo() {
            return vaccForIoVersionAccessors;
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

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
