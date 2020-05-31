
package tarea_vanguardia;


/**
 *
 * @author Ingrid
 */
public class Tarea_Vanguardia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SINGLETON
        //instancia 
        EagerSingleton a = EagerSingleton.getInstance();
        System.out.println("SINGLETON");
        System.out.println("Instancia Creada: "+ a.toString()+ "\n");
        
        
        //FACTORY
        //primera instancia
        System.out.println("FACTORY");
        Car small = new CarFactory().buildCar(CarType.SMALL);
        //segunda instancia
        Car luxury = new CarFactory().buildCar(CarType.LUXURY);
        //tercera instancia
        Car sedan = new CarFactory().buildCar(CarType.SEDAN);
        System.out.println("Tipo de carro 1: "+small.model);
        System.out.println("Tipo de carro 2: "+luxury.model);
        System.out.println("Tipo de carro 3: "+sedan.model+ "\n");
        
        
        //OBSERVER
        System.out.println("OBSERVER");
        HeadHunter hunter = new HeadHunter();
        JobSeeker usuario1 = new JobSeeker("Karen");
        JobSeeker usuario2 = new JobSeeker("Raul");
        JobSeeker usuario3 = new JobSeeker("Samuel");
        
        hunter.registerObserver(usuario1);
        hunter.registerObserver(usuario2);
        hunter.registerObserver(usuario3);
        hunter.addJob("Transportista");
        System.out.println("Trabajo creado: "+hunter.getJobs().get(0));
        hunter.notifyAllObserver();
        System.out.println("");
        
        //BUILDER
        System.out.println("BUILDER");
        MealDirector mealDirector = new MealDirector();
        mealDirector.makeMeal(new SandwichMealBuilder());
    }
}// fin de la clase principal
