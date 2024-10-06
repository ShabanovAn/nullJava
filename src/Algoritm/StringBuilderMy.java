package Algoritm;

import java.sql.Date;
import java.util.Calendar;

public class StringBuilderMy {
    public static void main(String[] args) {

//Вот объяснение кода:
//
//getNearestSendingDate Функция принимает текущую дату в качестве входных данных и возвращает ближайшую дату отправки.

//Функция перебирает возможные даты отправки (1-я, 10-я и 20-я) и вычисляет дату отправки для каждого месяца с помощью
// getSendingDateForMonth вспомогательной функции.

//Для каждой даты отправки функция проверяет, рабочий ли это день, используя функцию getVacCheck. Если это рабочий день,
// функция обновляет ближайшую дату отправки, если она раньше текущей ближайшей даты отправки.

//getSendingDateForMonthВспомогательная функция вычисляет дату отправки для данного месяца и дня, устанавливая день, час,
// минуту и секунду объекта calendar.

    }

    public Date getNearestSendingDate(Date currentDate) {
        // Определите возможные даты отправки для каждого месяца
        int[] sendingDays = {1, 10, 20};
        // Инициализируйте ближайшую дату отправки по отношению к текущей дате
        java.sql.Date nearestSendingDate = currentDate;
        // Перебирать возможные даты отправки
        for (int sendingDay : sendingDays) {
            // Рассчитайте дату отправки за этот месяц
            Date sendingDate = getSendingDateForMonth(currentDate, sendingDay);
            // Проверьте, является ли дата отправки рабочим днем
            if (getVacCheck(sendingDate).equals(sendingDate)) {
                // Если это рабочий день, обновите ближайшую дату отправки
                if (sendingDate.before(nearestSendingDate) || nearestSendingDate.equals(currentDate)) {
                    nearestSendingDate = sendingDate;
                }
            }
        }
        return nearestSendingDate;
    }

    // Вспомогательная функция для расчета даты отправки за определенный месяц и день
    //currentDate - Текущая дата, День отправки - sendingDay
    private Date getSendingDateForMonth(Date currentDate, int sendingDay) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.set(Calendar.DAY_OF_MONTH, sendingDay);
        calendar.set(Calendar.HOUR_OF_DAY, 18);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return new Date(calendar.getTimeInMillis());
    }

    public java.sql.Date getVacCheck(java.sql.Date modDate) {
        return new java.sql.Date(modDate.getDate(), modDate.getMonth(), modDate.getDay());
    }
}
