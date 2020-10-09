package org.moflon.ide.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.moflon.core.preferences.EMoflonPreferencesActivator;
import org.moflon.core.preferences.EMoflonPreferencesStorage;
import org.moflon.core.utilities.WorkspaceHelper;

public class EMoflonPreferenceInitializer extends AbstractPreferenceInitializer {
	/**
	 * Empty default constructor
	 */
	public EMoflonPreferenceInitializer() {
		// Needed for OSGi
	}

	@Override
	public void initializeDefaultPreferences() {
		getValidationTimeoutMillis();
	}

	/**
	 * Stores the default values to the {@link EMoflonPreferenceInitializer}
	 * singleton (as specified in {@link EMoflonPreferencesStorage}).
	 */
	public static void resetToDefaults() {
		setReachabilityEnabled(EMoflonPreferencesStorage.DEFAULT_REACHABILITIY_IS_ENABLED);
		setReachabilityMaxAdornmentSize(EMoflonPreferencesStorage.DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE);
		setValidationTimeoutMillis(EMoflonPreferencesStorage.DEFAULT_VALIDATION_TIMEOUT_MILLIS);
	}

	public static int getValidationTimeoutMillis() {
		return getPreferences().getInt(EMoflonPreferencesStorage.KEY_VALIDATION_TIMEOUT,
				EMoflonPreferencesStorage.DEFAULT_VALIDATION_TIMEOUT_MILLIS);
	}

	public static void setValidationTimeoutMillis(final int validationTimeout) {
		getPreferences().putInt(EMoflonPreferencesStorage.KEY_VALIDATION_TIMEOUT, validationTimeout);
		EMoflonPreferencesActivator.getDefault().getPreferencesStorage().put(EMoflonPreferencesStorage.KEY_VALIDATION_TIMEOUT, validationTimeout);
	}

	public static void setReachabilityEnabled(final boolean isEnabled) {
		getPreferences().putBoolean(EMoflonPreferencesStorage.KEY_REACHABILITY_ENABLED, isEnabled);
		EMoflonPreferencesActivator.getDefault().getPreferencesStorage().put(EMoflonPreferencesStorage.KEY_REACHABILITY_ENABLED, isEnabled);
	}

	public static boolean getReachabilityEnabled() {
		return getPreferences().getBoolean(EMoflonPreferencesStorage.KEY_REACHABILITY_ENABLED,
				EMoflonPreferencesStorage.DEFAULT_REACHABILITIY_IS_ENABLED);
	}

	public static void setReachabilityMaxAdornmentSize(final int maxAdornmentSize) {
		getPreferences().putInt(EMoflonPreferencesStorage.KEY_REACHABILITY_MAX_ADORNMENT_SIZE, maxAdornmentSize);
		EMoflonPreferencesActivator.getDefault().getPreferencesStorage()
				.put(EMoflonPreferencesStorage.KEY_REACHABILITY_MAX_ADORNMENT_SIZE, maxAdornmentSize);
	}

	public static int getReachabilityMaxAdornmentSize() {
		return getPreferences().getInt(EMoflonPreferencesStorage.KEY_REACHABILITY_MAX_ADORNMENT_SIZE,
				EMoflonPreferencesStorage.DEFAULT_REACHABILITY_MAX_ADORNMENT_SIZE);
	}

	private static IEclipsePreferences getPreferences() {
		return InstanceScope.INSTANCE.getNode(WorkspaceHelper.getPluginId(EMoflonPreferenceInitializer.class));
	}
}
