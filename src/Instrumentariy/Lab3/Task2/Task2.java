package Instrumentariy.Lab3.Task2;

/**
 * Смоделировать структуру банка:
 * Класс            Свойства
 * ________________________________________________
 * Банк	            название (get, set)
 * ________________________________________________
 * Филиал	        название (get, set)
 *                   общая сумма вкладов (get, set)
 * _________________________________________________
 * Вклад	        фио вкладчика (get, set)
 *                  сумма вклада (get, set)
 * __________________________________________________*/
/**
 *
 * Связать между собой классы Банк, Филиал и Вклад, так, чтобы каждый банк содержал филиалы,*/
/**
 *
 * каждый филиал содержал указание в каком банке он находится, и какие вклады он содержит,
 */
/**
 *
 * каждый вклад – в каком филиале он размещен.
 */
/**
 *
 * -Добавить в класс Банк множественное свойство «филиалы» (get) и метод «добавить филиал» (add)
 *
 */
/**
 *
 * -Добавить в класс Филиал свойство «банк» (get) и свойство «вклады» (get),
 * а также методы «добавить вклад» (add), «удалить вклад» (remove).
 */
/**
 *
 * Удалить set для свойства «общая сумма вкладов» и сделать так,
 * чтобы данное свойство рассчитывалось автоматически (на основе свойства «вклады»).
 */
/**
 *
 * -Добавить в класс «Вклад» свойство «Филиал»,
 */
/**
 *
 * -Удалить из класса «Вклад» set для свойства «сумма вклада» и добавить
 * метод «пополнить счет (сумма)»
 */
/**
 *
 * Создать один объект класса Банк, в данный банк добавить два филиала,
 * в каждый из филиалов добавить по два вклада.
 */
/**
 *
 * Вывести на экран вклады одного из филиалов, и общую сумму вкладов по этому филиалу.
 */
/**
 *
 * Выполнить пополнение счета одного из вкладов и снова вывести информация о вкладах на экран.
 */

public class Task2 {
    public static void main(String[] args) {
        Bank bank = new Bank("Sberbank");
        Filial filial = new Filial(bank,"Sber1");
        Filial filial1 = new Filial(bank,"Sber2");
        Depositor depositor = new Depositor(filial,"Dep1");
        Depositor depositor1 = new Depositor(filial, "Dep2");
        Depositor depositor2 = new Depositor(filial1,"Dep3");
        Depositor depositor3 = new Depositor(filial1,"Dep4");
        depositor.addDepositorSum(5000);
        depositor1.addDepositorSum(4000);
        depositor2.addDepositorSum(3000);
        depositor3.addDepositorSum(2000);

        System.out.println(bank);
        System.out.println(filial);
        System.out.println(filial1);
        System.out.println(depositor);

        depositor2.addDepositorSum(10000);
        System.out.println(filial1);
    }
}