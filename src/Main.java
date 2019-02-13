import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Census> CensusData = new ArrayList<Census>();
    public static float[] percents = new float[CensusData.size()];
    public static boolean read = false;
    public static ArrayList<changeAndGeo> changeAndGeo = new ArrayList<changeAndGeo>();
       
    public static float[] runAlgo(int year1, int year2) throws FileNotFoundException {
        float[] finalData = new float[CensusData.size()];
        
        float[] pop1 = new float[CensusData.size()];
        float[] pop2 = new float[CensusData.size()];
        if (year2 < year1) {
            int temp = year1;
            year1 = year2;
            year2 = temp;
        }
        for (int i = 0; i < CensusData.size(); i++) {
            if (year1 == 2010) { pop1[i] = CensusData.get(i).getPopulationEstimate2010(); }
            if (year1 == 2011) { pop1[i] = CensusData.get(i).getPopulationEstimate2011(); }
            if (year1 == 2012) { pop1[i] = CensusData.get(i).getPopulationEstimate2012(); }
            if (year1 == 2013) { pop1[i] = CensusData.get(i).getPopulationEstimate2013(); }
            if (year1 == 2014) { pop1[i] = CensusData.get(i).getPopulationEstimate2014(); }
            if (year1 == 2015) { pop1[i] = CensusData.get(i).getPopulationEstimate2015(); }
            
            if (year2 == 2011) { pop2[i] = CensusData.get(i).getPopulationEstimate2011(); }
            if (year2 == 2012) { pop2[i] = CensusData.get(i).getPopulationEstimate2012(); }
            if (year2 == 2013) { pop2[i] = CensusData.get(i).getPopulationEstimate2013(); }
            if (year2 == 2014) { pop2[i] = CensusData.get(i).getPopulationEstimate2014(); }
            if (year2 == 2015) { pop2[i] = CensusData.get(i).getPopulationEstimate2015(); }
            if (year2 == 2016) { pop2[i] = CensusData.get(i).getPopulationEstimate2016(); }
            //finalData[i] = 100*(pop2 - pop1)/pop1;
            
            finalData[i] = (100*(pop2[i] - pop1[i])/pop1[i]);
            float change = (100*(pop2[i] - pop1[i])/pop1[i]);
            changeAndGeo.add(new changeAndGeo(CensusData.get(i).getGeoArea(),change ));
            //finalData[i+CensusData.size()] = i;
            //System.out.println(100*(pop2[i] - pop1[i])/pop1[i]);
        }
        return finalData;
    }
    
    public static void fileReader() throws FileNotFoundException { // shared with Matthew Rodgers
        
        //Creates an array list that populated with the file data separated by commas
        ArrayList<String> census_file_data = new ArrayList<String>();
        Scanner file = new Scanner(new File("ds.csv"));
        file.useDelimiter(",");
        while (file.hasNext()) {
                census_file_data.add(file.nextLine());
        }
        file.close();

        //Creates an array populated with the array list elements converted to strings and separated by line breaks
        String the_data = census_file_data.subList(0, census_file_data.size()).toString();
        String[] data_array_not_split = the_data.split("\"");
        for(int j = 0; j < data_array_not_split.length; j++) {
                data_array_not_split[j] = data_array_not_split[j].replaceAll(",", "").replaceAll(" ", "");
        }
        ArrayList<String> tempList = new ArrayList<String>();

        for(int k = 0; k < data_array_not_split.length; k++) {
                tempList.add(data_array_not_split[k]);
        }

        tempList.removeAll(Collections.singleton(null));
        tempList.removeAll(Collections.singleton(""));

        String[] data_array = new String[tempList.size()];
        data_array = tempList.toArray(data_array);
        
        int i = 0;
        while (i != data_array.length-1) {
            if(i == 0 || (i % 10) == 0 ) {
                    CensusData.add(new Census(data_array[i], Integer.parseInt(data_array[i+1].replaceAll(",", "")), Integer.parseInt(data_array[i+2].replaceAll(",", "")), Integer.parseInt(data_array[i+3].replaceAll(",", "")), Integer.parseInt(data_array[i+4].replaceAll(",", "")), Integer.parseInt(data_array[i+5].replaceAll(",", "")), Integer.parseInt(data_array[i+6].replaceAll(",", "")), Integer.parseInt(data_array[i+7].replaceAll(",", "")), Integer.parseInt(data_array[i+8].replaceAll(",", "")), Integer.parseInt(data_array[i+9].replaceAll(",", ""))));
            }	
            i++;
        }
        read = true;
    }
        
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (read == false) {
                fileReader();
            }
        }
        catch(FileNotFoundException exception) {
            exception.printStackTrace();
        }
        percents = runAlgo(Homepage.year1, Homepage.year2);
        //sortingAlgos.mergeSort(percents, 0, percents.length-1);
        
    }
    
}
