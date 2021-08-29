package Lesson7;

public class MainAppLesson7 {
        public static void main(String[] args) {

            Cat[] cats = {
                    new Cat ("Кот", 5),
                    new Cat ("Кошка", 10),
                    new Cat ("Тишка", 12),
                    new Cat ("Рыжый", 23),
                    new Cat ("Барсик", 13)
            };
            Plate plate = new Plate(50);

            for (int i = 0; i <  cats.length; i++) {
                cats[i].info();
                plate.info();
                cats[i].eat(plate);
                cats[i].info();
                plate.info();


            }

        }


}
