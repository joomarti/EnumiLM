public enum Day {
    MONDAY("Дуйшонбу","Java"),
    TUESDAY("Шаишенби","Praktica"),
    WENDEESDAY( "Шаршенби", "Java"),
    THURSDAY("Бейшенби","Практика "),
    FRIDAY("Жума","Техника Soft Skill"),
    SATURDAY("Ишенби",null),
    SUNDAY("Жекшенби",null);
    private String translationInKyrgyz;
    private String timetableLessons;

    Day(String translationInKyrgyz, String timetableLessons) {
        this.translationInKyrgyz = translationInKyrgyz;
        this.timetableLessons = timetableLessons;
    }

    public String getTranslationInKyrgyz() {
        return translationInKyrgyz;
    }

    public void setTranslationInKyrgyz(String translationInKyrgyz) {
        this.translationInKyrgyz = translationInKyrgyz;
    }

    public String getTimetableLessons() {
        return timetableLessons;
    }

    public void setTimetableLessons(String timetableLessons) {
        this.timetableLessons = timetableLessons;
    }
}