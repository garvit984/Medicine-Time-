package com.example.medicinetime.alarm;

import com.example.medicinetime.BasePresenter;
import com.example.medicinetime.BaseView;
import com.example.medicinetime.data.source.History;
import com.example.medicinetime.data.source.MedicineAlarm;

/**
 * Created by example on 13/07/17.
 */

public interface ReminderContract {

    interface View extends BaseView<Presenter> {

        void showMedicine(MedicineAlarm medicineAlarm);

        void showNoData();

        boolean isActive();

        void onFinish();

    }

    interface Presenter extends BasePresenter {

        void finishActivity();

        void onStart(long id);

        void loadMedicineById(long id);

        void addPillsToHistory(History history);

    }
}
