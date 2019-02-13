
public class Census {
    private String geoArea;
    private int census;
    private int estimatesBase;
    private int populationEstimate2010;
    private int populationEstimate2011;
    private int populationEstimate2012;
    private int populationEstimate2013;
    private int populationEstimate2014;
    private int populationEstimate2015;
    private int populationEstimate2016;

    public Census() {

    }

    public Census(String geoArea, int census, int estimates, int p2010, int p2011, int p2012, int p2013, int p2014, int p2015, int p2016) {
            setGeoArea(geoArea);
            setCensus(census);
            setEstimatesBase(estimates);
            setPopulationEstimate2010(p2010);
            setPopulationEstimate2011(p2011);
            setPopulationEstimate2012(p2012);
            setPopulationEstimate2013(p2013);
            setPopulationEstimate2014(p2014);
            setPopulationEstimate2015(p2015);
            setPopulationEstimate2016(p2016);
		
	}
    // getters and settters for features of data
	public String getGeoArea() {
		return geoArea;
	}
	public void setGeoArea(String geoArea) {
		this.geoArea = geoArea;
	}
	public int getCensus() {
		return census;
	}
	public void setCensus(int census) {
		this.census = census;
	}
	public int getEstimatesBase() {
		return estimatesBase;
	}
	public void setEstimatesBase(int estimatesBase) {
		this.estimatesBase = estimatesBase;
	}
	public int getPopulationEstimate2010() {
		return populationEstimate2010;
	}
	public void setPopulationEstimate2010(int populationEstimate2010) {
		this.populationEstimate2010 = populationEstimate2010;
	}
	public int getPopulationEstimate2011() {
		return populationEstimate2011;
	}
	public void setPopulationEstimate2011(int populationEstimate2011) {
		this.populationEstimate2011 = populationEstimate2011;
	}
	public int getPopulationEstimate2012() {
		return populationEstimate2012;
	}
	public void setPopulationEstimate2012(int populationEstimate2012) {
		this.populationEstimate2012 = populationEstimate2012;
	}
	public int getPopulationEstimate2013() {
		return populationEstimate2013;
	}
	public void setPopulationEstimate2013(int populationEstimate2013) {
		this.populationEstimate2013 = populationEstimate2013;
	}
	public int getPopulationEstimate2014() {
		return populationEstimate2014;
	}
	public void setPopulationEstimate2014(int populationEstimate2014) {
		this.populationEstimate2014 = populationEstimate2014;
	}
	public int getPopulationEstimate2015() {
		return populationEstimate2015;
	}
	public void setPopulationEstimate2015(int populationEstimate2015) {
		this.populationEstimate2015 = populationEstimate2015;
	}
	public int getPopulationEstimate2016() {
		return populationEstimate2016;
	}
	public void setPopulationEstimate2016(int populationEstimate2016) {
		this.populationEstimate2016 = populationEstimate2016;
	}  
}
