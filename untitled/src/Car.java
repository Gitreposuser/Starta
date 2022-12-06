public class Car {
    String type;
    String model;
    int year;
    String typeOfSignal;

    public Car(){
        this.type = "GTR";
        this.model = "Mustang";
        this.year = 1976;
        this.typeOfSignal = "cucaracha";
    }

    public Car(String type, String model, int year, String typeOfSignal)
    {
        this.type = type;
        this.model = model;
        this.year = year;
        this.typeOfSignal = typeOfSignal;
    }

    private void Beep()
    {
        System.out.println("Beep beep");
    }

    public void Beep(String typeOfBeep)
    {
        if("cucaracha" == this.typeOfSignal)
            System.out.println("Cucaracha beep.");
        else
            Beep();
    }

    public void CarInfo()
    {
        ShowText("***************");
        ShowText(this.type);
        ShowText(this.model);
        ShowText(Integer.toString(this.year));
        ShowText(this.typeOfSignal);
        ShowText("***************");
    }

    private void ShowText(String text)
    {
        System.out.println(text);
    }
}