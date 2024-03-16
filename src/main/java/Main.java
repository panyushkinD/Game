import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Квест по доте 2:");
        System.out.println("Привет. Сегодня мы будем играть с главной руиной всей планеты!");
        System.out.println("Брат, твоя задача проста. Нужно выиграть игру и не разозлить Сергёгу!");
        System.out.println("Если Серега ливает квест считается не пройденным!");
        System.out.println(" ");

        String heroRubic = "Рубик";
        String heroFura = "Фурион";
        String heroApparation = "Аппарат";
        String heroSkyMage = "Скаймаг";

        String firstHero = Util.inputString("Выберете героя: " + heroApparation + " " + heroFura + " " + heroRubic + " " + heroSkyMage);
        try {
            if (firstHero.equals(heroFura)) {
                System.out.println("Вы выбрали героя: " + firstHero);
                System.out.println("Игра проиграна. :( Серега ливнул на стадии выбора героя");

            } else if (firstHero.equals(heroRubic)) {
                System.out.println("Вы выбрали героя: " + firstHero);
                System.out.println("Игра проиграна. :( Серега ливнул на стадии выбора героя");
            } else if (firstHero.equals(heroApparation)) {
                System.out.println("Вы выбрали героя: " + firstHero);
                System.out.println("Выберите стиль игры.");
                System.out.println("1. Играть как дурик через аганим, мун шард и рапиру. ");
                System.out.println("2. Играть нормально через сап итемы.");
                Scanner scanner = new Scanner(System.in);
                int Snow = scanner.nextInt();

                switch (Snow) {
                    case 1:
                        System.out.println("Поздравлю! Катка слита!");
                        break;
                    case 2:
                        System.out.println("Затащил батя!");
                }
            } else if (firstHero.equals(heroSkyMage)) {
                System.out.println("Вы выбрали героя: " + firstHero);
                System.out.println("Правильный выбор. Как говорят профессионалы: 'пик это 50 % победы'!");
                System.out.println(" ");
                System.out.println("Выберите сборку покупки предметов:");
                System.out.println("1. Собираться по GreyShark.");
                System.out.println("2. Скупить все манго и кларити из магазина.");
                int itemBuild = Util.inputInt("Выбор сборки: ", 1, 2);
                if (itemBuild == 1) {
                    System.out.println("Игра проиграна. :( Серега ливнул на стадии выбора героя");
                } else if (itemBuild == 2) {
                    System.out.println("Хороший выбор. Пора побеждать! ");
                    System.out.println("Что мы будем делать на лайне:");
                    System.out.println("1. Стоять 'фотографировать', когда Серегу пинают.");
                    System.out.println("2. Харасить варжеских геров.");
                    System.out.println("3. Фидить по приколу.");
                    int action = Util.inputInt("Выбор действия: ", 1, 3);
                    if (action == 1) {
                        System.out.println("Игра проиграна. :( Серега ливнул!");

                    } else if (action == 2) {
                        System.out.println("Отлично вражеские герои отступают");
                        System.out.println("Но появилась проблема. У Сереги 20 урона с дуэлей на 20 минуте!");
                        System.out.println("Что будете делать дальше?");
                        System.out.println("1. Орать:'азаза лалка.");
                        System.out.println("2. Подбодрить. С кем не бывает.");
                        System.out.println("3. Помочь набить урон. ");
                        int action2 = Util.inputInt("Выбор действия: ", 1, 3);
                        if (action2 == 1) {
                            System.out.println("Игра проиграна. :( Серега ливнул!");
                        } else if (action2 == 2) {
                            System.out.println("Игра проиграна. Нужно было брать всё в свои руки.");
                        } else if (action2 == 3) {
                            System.out.println("Отлично. Вы много раз убили вражеских героев и выиграли ключевой файт");
                            System.out.println("Ваши дальнейшие действия:");
                            System.out.println("1. Обозвать Саню за его мидовую бруду и закончить игру.");
                            System.out.println("2. Обозвать Серегу Сноу за его Сладара 5 и закончить игру.");
                            System.out.println("3. Похвалить Данила за выигранныю игру.");
                            int action3 = Util.inputInt("Выбор действия: ", 1, 3);
                            if (action3 == 1) {
                                System.out.println("Вас убили под троном и вы проиграли!");
                            } else if (action3 == 2) {
                                System.out.println("Вас убили под троном и вы проиграли!");
                            } else if (action3 == 3) {
                                System.out.println("Красава. Ты прошёл квест и затащил раков +25птс.");
                                for (int i = 0; i < 2; i++) {
                                    System.out.println("The end!");
                                }
                            }
                        }
                    } else if (action == 3) {
                        System.out.println("Игра проиграна. :( Серега ливнул!");
                    }


                }


            } else {
                System.out.println("Хрень ввел. Проиграл!");
            }


        } catch (Exception e) {
            System.out.println("Дядя. Ты не очень!.Проиграл ");
        }
    }
}



