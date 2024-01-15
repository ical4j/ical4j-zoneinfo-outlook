package net.fortuna.ical4j.zoneinfo.outlook;

import net.fortuna.ical4j.model.DefaultZoneRulesProvider;
import net.fortuna.ical4j.model.TimeZoneLoader;

import java.time.zone.ZoneRulesProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A default {@link ZoneRulesProvider} implementation for included timezone definitions. To avoid conflicting with
 * the standard Java zone rules this provider maintains an internal map of local zone ids to globally unique ids.
 *
 * NOTE: Globally unique zone identifiers are transient and will be regenerated for each instance of this class. They
 * are only used to support registration and use of alternative definitions in the scope of this library.
 */
public class OutlookZoneRulesProvider extends DefaultZoneRulesProvider {

    private static final Map<String, String> ZONE_IDS = new ConcurrentHashMap<>();

    public OutlookZoneRulesProvider() {
        super(new TimeZoneLoader(OutlookTimeZoneRegistryFactory.RESOURCE_PREFIX), ZONE_IDS);
    }
}
