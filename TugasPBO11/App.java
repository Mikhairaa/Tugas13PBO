

public class App {
    public static void main(String[] args) {

    //polymorphisme
    DataPelanggan pelanggan1 = new Pelanggan();
    
    Kasir Kasir1 = new Kasir();
    Kasir1.login();

    //exception    
    try {
        pelanggan1.inputDataPelanggan();
    } 
    catch (Exception e){
        System.out.println("Error, kesalahan input");
    }
    
    //menampilkan struk
    pelanggan1.struk();
    }
}
