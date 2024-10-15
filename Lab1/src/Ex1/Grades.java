package Ex1;

public class Grades {


    public int[] insufficientGrade(int[] grades)
    {
        int [] insufficientGrades = new int[0];
        for(int i = 0; i < grades.length; i++)
        {
            if (grades[i] < 40)
            {
                insufficientGrades = AddToArray(insufficientGrades,grades[i]);
            }
        }
        return insufficientGrades;
    }

    public int[] AverageGrade(int[] grades)
    {
        return grades;
    }

    public int[] AdjustGrades(int [] grades)
    {

        for(int i = 0; i < grades.length; i++)
        {
            if(grades[i] < 38)
            {
                continue;
            }
            else
            {
                if(grades[i]%5>=3)
                {
                    while (grades[i] % 5 != 0)
                        grades[i]++;

                }

            }
        }
        return grades;
    }
    private int[] AddToArray(int[] array, int grade)
    {
        int [] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = grade;
        return newArray;
    }

}
