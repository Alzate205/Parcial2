enum Transporte {
    Bus("Diesel", 20) {
        @Override
        public String mostrarDescripcion() {
            return "The bus can accommodate 20 passengers";
        }
    },
    Train("Gas", 55) {
        @Override
        public String mostrarDescripcion() {
            return "The train can accommodate 55 passengers";
        }
    },
    Boat("Diesel", 150){
        @Override
        public String mostrarDescripcion() {
            return "The boat has capacity for 150 passengers";
        }
    },
    Bike("Gasolina", 2){
        @Override
        public String mostrarDescripcion() {
            return "The bike can accommodate 2 passengers";
        }
    },
    Aircraft("Gasolina", 70){
        @Override
        public String mostrarDescripcion() {
            return "The aircraft can accommodate 70 passengers";
        }
    };

    private String motor;

    private int capacidad;

    Transporte(String motor, int capacidad) {
        this.motor = motor;
        this.capacidad = capacidad;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public abstract String mostrarDescripcion();
}




