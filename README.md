MS Outlook-compatible Timezone Definitions
==========================================

iCal4j ZoneInfo Outlook provides alternate timezone definitions that may provide greater compatibility with certain versions of Microsoft Outlook.

## Usage

To use the alternate timezone definitions you may create a custom TimeZoneRegistry instance using the applicable prefix:

        CalendarParser parser = CalendarParserFactory.getInstance().createParser();
        
        PropertyFactoryRegistry propertyFactoryRegistry = new PropertyFactoryRegistry();
        propertyFactoryRegistry.register(WrTimezone.PROPERTY_NAME, WrTimezone.FACTORY);
        propertyFactoryRegistry.register(WrCalName.PROPERTY_NAME, WrCalName.FACTORY);
        
        ParameterFactoryRegistry parameterFactoryRegistry = new ParameterFactoryRegistry();
        
        TimeZoneRegistry tzRegistry = new TimeZoneRegistryImpl("zoneinfo-outlook/");
        
        builder = new CalendarBuilder(parser, propertyFactoryRegistry, parameterFactoryRegistry, tzRegistry);
        
A convenient factory for the Outlook-compatible definitions is also provided, so in such cases all you need to do is add the following property to your ical4j.properties included in your classpath:

`net.fortuna.ical4j.timezone.registry=net.fortuna.ical4j.zoneinfo.outlook.OutlookTimeZoneRegistryFactory`

## Minimum requirements

None.
