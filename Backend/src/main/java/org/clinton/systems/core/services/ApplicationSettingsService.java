package org.clinton.systems.core.services;

import org.clinton.systems.core.services.base.GenericService;
import org.clinton.systems.core.models.settings.ApplicationSettings;

/**
 * Responsible for CRUD operations on {@link ApplicationSettings}
 * @author ttc
 */
public interface ApplicationSettingsService extends GenericService<ApplicationSettings> {
    /**
     * Gets {@link ApplicationSettings}
     *
     * @return
     */
    ApplicationSettings getActiveApplicationSettings();
}
