
public class Main {

    public static void main(String[] args){
     String[] socialNetwork ={"instagram", "odnoklassniki", "vk"};
        for (String sweet:socialNetwork) {
            Printable printable = createObject(sweet);
            printable.print();

        }


        }
        public static Printable createObject(String className) {
            Printable printable = null;
            switch (className) {
                case "instagram" -> {
                    printable = new Instagram("keep in touch at a distance ", 1500000, "many benefits");
                }
                case "odnoklassniki" -> {
                    printable= new Odnoklassniki(2006, "Orange", "many benefits");
                }
                case "vk" -> {
                    printable = new VK("Listening music", 30, "many benefits");
                }
            }
            return printable;
        }


    }







