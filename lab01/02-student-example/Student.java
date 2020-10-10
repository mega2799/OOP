class Student {
    String name;
    String surname;
    int id;
    int matriculationYear;
    void build(String name,String surname,int id,int matriculationYear) {
      this.name = name;
      this.surname = surname;
      this.id = id;
      this.matriculationYear = matriculationYear;
    }
    void printStudentInfo() {
        System.out.println("name: " + this.name);
        System.out.println("surname: " + this.surname);
        System.out.println("id: " + this.id);
        System.out.println("year of matr: " + this.matriculationYear);
    }
}
