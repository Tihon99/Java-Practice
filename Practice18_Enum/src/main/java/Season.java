public enum Season {
    WINTER {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING {
        @Override
        public String getDescription() {
            return "Время пробуждения природы";
        }
    },
    SUMMER {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN {
        @Override
        public String getDescription() {
            return "Время сбора урожая";
        }
    };

    public abstract String getDescription();
}
