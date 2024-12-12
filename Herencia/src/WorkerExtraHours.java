public class WorkerExtraHours extends Worker{

    private Integer extraHoursWorked;
    private Double pricePerHour;

    public WorkerExtraHours(String name, Double salary, Integer extraHoursWorked, Double pricePerHour) {
        super(name, salary);
        this.extraHoursWorked = extraHoursWorked;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public Double calculateSalary() {
        return super.calculateSalary() + (extraHoursWorked * pricePerHour);

    }
}
