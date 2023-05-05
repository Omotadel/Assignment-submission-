public class energy {
    public static double calculateKineticEnergy(double mass, double velocity) {
        double gravity = physics.getGravity();
        return 0.5 * mass * velocity * velocity;
    }

    public static double calculatePotentialEnergy(double mass, double height) {
        double gravity = physics.getGravity();
        return mass * gravity * height;
    }

    public static double calculateGravitationalPotentialEnergy(double mass, double height) {
        double gravity = physics.getGravity();
        return mass * gravity * height;
    }

    public static double calculateElasticPotentialEnergy(double springConstant, double displacement) {
        double gravity = physics.getGravity();
        return 0.5 * springConstant * displacement * displacement;
    }

    public static double calculateWorkEnergyPrinciple(double initialKE, double workDone) {
        double gravity = physics.getGravity();
        return initialKE + workDone;
    }
}
