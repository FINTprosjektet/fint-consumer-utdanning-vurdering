package no.fint.consumer.config;

public enum Constants {
;

    public static final String COMPONENT = "utdanning-vurdering";
    public static final String COMPONENT_CONSUMER = COMPONENT + " consumer";
    public static final String CACHE_SERVICE = "CACHE_SERVICE";

    
    public static final String CACHE_INITIALDELAY_EKSAMENSGRUPPE = "${fint.consumer.cache.initialDelay.eksamensgruppe:900000}";
    public static final String CACHE_FIXEDRATE_EKSAMENSGRUPPE = "${fint.consumer.cache.fixedRate.eksamensgruppe:900000}";
    
    public static final String CACHE_INITIALDELAY_EKSAMENSGRUPPEMEDLEMSKAP = "${fint.consumer.cache.initialDelay.eksamensgruppemedlemskap:1000000}";
    public static final String CACHE_FIXEDRATE_EKSAMENSGRUPPEMEDLEMSKAP = "${fint.consumer.cache.fixedRate.eksamensgruppemedlemskap:900000}";
    
    public static final String CACHE_INITIALDELAY_FRAVAR = "${fint.consumer.cache.initialDelay.fravar:1100000}";
    public static final String CACHE_FIXEDRATE_FRAVAR = "${fint.consumer.cache.fixedRate.fravar:900000}";
    
    public static final String CACHE_INITIALDELAY_KARAKTERVERDI = "${fint.consumer.cache.initialDelay.karakterverdi:1200000}";
    public static final String CACHE_FIXEDRATE_KARAKTERVERDI = "${fint.consumer.cache.fixedRate.karakterverdi:900000}";
    
    public static final String CACHE_INITIALDELAY_VURDERING = "${fint.consumer.cache.initialDelay.vurdering:1300000}";
    public static final String CACHE_FIXEDRATE_VURDERING = "${fint.consumer.cache.fixedRate.vurdering:900000}";
    

}
