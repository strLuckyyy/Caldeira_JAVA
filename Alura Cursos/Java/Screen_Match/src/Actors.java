public class Actors {
    private String name;
    private int yearBirth;
    private int monthBirth;
    private int dayBirth;
    
    public Actors(String name, int yearBirth, int monthBirth, int dayBirth) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
    }

    public String getName() {
        return this.name;
    }

    public int getYearBirth() {
        return this.yearBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    public void setDayBirth(int dayBirth) {
        this.dayBirth = dayBirth;
    }


    // this method return the actor's age
    public int age(int currentYear, int currentMonth, int currentDay) {
        // Checking if the actor's date of birth has passed, to return a more accurate age
        if (currentMonth < this.monthBirth) {
            return currentYear - this.yearBirth - 1;
        }
        if (currentDay < this.dayBirth) {
            return currentYear - this.yearBirth - 1;
        }

        return currentYear - this.yearBirth;
    }
}
