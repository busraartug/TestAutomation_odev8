package tr.com.testautomation;

public class Main {
    public static void main(String[] args) {
        Company busraLTD = new Company("Busra Limited");

        Personnel ahmet = new Personnel("Ahmet", "ASD", 32, Personnel.Gender.MALE);
        Personnel mehmet = new Personnel("Mehmet", "ABC", 22, Personnel.Gender.MALE);
        Personnel ayse = new Personnel("Ayşe", "YYY", 28, Personnel.Gender.FEMALE);
        Personnel fatma = new Personnel("Fatma", "AAB", 40, Personnel.Gender.FEMALE);
        Personnel zeynep = new Personnel("Zeynep", "TTT", 40, Personnel.Gender.FEMALE);

        busraLTD.addPersonnel(ahmet);
        busraLTD.addPersonnel(mehmet);
        busraLTD.addPersonnel(ayse);
        busraLTD.addPersonnel(fatma);
        busraLTD.addPersonnel(zeynep);

        Department muhendislik = new Department(ayse);
        Department idari = new Department(fatma);

        busraLTD.addDepartment(muhendislik);
        busraLTD.addDepartment(idari);

        try {
            muhendislik.addPersonel(ahmet);
            muhendislik.addPersonel(mehmet);
            idari.addPersonel(zeynep);
            for (Personnel personnel : busraLTD.getPersonels()) {
                System.out.println(personnel.getName() + " " + personnel.getSurname() + " adlı çalışanın emeklilik durumu : " + (personnel.calculate() > 0 ? personnel.calculate() + " yıl sonra emekli olabilir." : "Emekliliğe hak kazanmıştır."));
            }
            Company.RemovePersonnelResult result = busraLTD.removePersonnel(zeynep);
            System.out.println("İşten çıkarılma durumu : " + result.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}