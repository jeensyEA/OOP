package HW5.presenters;

import java.util.Collection;
import java.util.Date;

import HW5.models.Table;
import HW5.views.ViewObserver;

public interface View {

    /**
     * Отобразить список всех столиков
     * @param tables список столиков
     */
    void showTables(Collection<Table> tables);

    void showReservationStatus(String status, int reservationNo, Date date, String name);

    void showAllReservations(Collection<Table> tables);

    /**
     * Установить нового наблюдателя
     * @param observer наблюдатель (презентер)
     */
    void setObserver(ViewObserver observer);


}