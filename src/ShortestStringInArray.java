public class ShortestStringInArray {
    public static void main(String[] args)
    {
        String[] friends = {"John","Shawn","Eric","John","Sergio","Peter","Steve","Lee"};

        System.out.println("The shortest name is: "+getShortestName(friends));
    }

    /**
     * This method will receive an Array of String objects
     * and return the shortest ones
     */
    public static String getShortestName(String[] array)
    {
        String shortest = array[0];
        String returnString = "";

        for (int i=0; i<array.length; i++)
        {
            if (array[i].length()<shortest.length())
            {
                returnString = array[i];
                shortest = array[i];
            }
            else if (array[i].length() == shortest.length())
            {
                if (i==0)
                    returnString = array[i];
                else
                    returnString += ", " + array[i];
            }
        }
        return returnString;

    }
}
