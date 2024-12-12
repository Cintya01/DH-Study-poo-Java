public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("cin", 1000.0);

        System.out.println(worker.getName() + " tiene un sueldo de $" + worker.calculateSalary());

        WorkerExtraHours workerExtraHours = new WorkerExtraHours("maria", 1000.0, 3,100.0);

        System.out.println(workerExtraHours.getName() + " tiene un sueldo de $" + workerExtraHours.calculateSalary());
    }
}