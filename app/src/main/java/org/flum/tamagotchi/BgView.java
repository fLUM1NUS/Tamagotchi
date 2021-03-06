package org.flum.tamagotchi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Objects;

public class BgView extends View {

    public static Intent intentToMiniGame;

    public static IndicatorsView indicatorsView = new IndicatorsView();

    public BgView(Context context) {
        super(context);
    }

    public static Fragment fragment = new Fragment();


    public static class View1 extends Fragment {

        public void updateInd() {
            ProgressBar indDrinkBar = getActivity().findViewById(R.id.indDrinkBar);
            TextView indDrinkInt = getActivity().findViewById(R.id.indDrinkInt);
            indDrinkBar.setProgress(Person.drink);
            indDrinkInt.setText(String.valueOf(Person.drink));
            ProgressBar indEatBar = getActivity().findViewById(R.id.indEatBar);
            TextView indEatInt = getActivity().findViewById(R.id.indEatInt);
            indEatBar.setProgress(Person.eat);
            indEatInt.setText(String.valueOf(Person.eat));
            ProgressBar indSleepBar = getActivity().findViewById(R.id.indSleepBar);
            TextView indSleepInt = getActivity().findViewById(R.id.indSleepInt);
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            ProgressBar indBoredBar = getActivity().findViewById(R.id.indBoredBar);
            TextView indBoredInt = getActivity().findViewById(R.id.indBoredInt);
            indBoredBar.setProgress(Person.bored);
            indBoredInt.setText(String.valueOf(Person.bored));
            ProgressBar indToiletBar = getActivity().findViewById(R.id.indToiletBar);
            TextView indToiletInt = getActivity().findViewById(R.id.indToiletInt);
            indToiletBar.setProgress(Person.toilet);
            indToiletInt.setText(String.valueOf(Person.toilet));
            ProgressBar indShowerBar = getActivity().findViewById(R.id.indShowerBar);
            TextView indShowerInt = getActivity().findViewById(R.id.indShowerInt);
            indShowerBar.setProgress(Person.shower);
            indShowerInt.setText(String.valueOf(Person.shower));
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.bg_view_1, container, false);

            // ???????????? ?????????? ???????????????? ???????? ????????????????, ?????????????????????????? ???? ??????????????????
            Button button_drink = (Button) view.findViewById(R.id.button_drink);
            Button button_eat = (Button) view.findViewById(R.id.button_eat);
            button_drink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Person.HMWater > 0) {
                        Person.Drink();
                        updateInd();
                        if (Person.drink < 100) Person.HMWater--;
                    }
                    else {
                        Snackbar.make(view, R.string.noWater, Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                }
            });


            button_eat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Person.HMEat > 1) {
                        Person.Eat();
                        updateInd();
                        if (Person.eat < 100) Person.HMEat--;
                    }
                    else {
                        Snackbar.make(view, R.string.noEat, Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                }
            });
            return view;
        }

    }

    public static class View2 extends Fragment {

        public void updateInd() {
            ProgressBar indDrinkBar = getActivity().findViewById(R.id.indDrinkBar);
            TextView indDrinkInt = getActivity().findViewById(R.id.indDrinkInt);
            indDrinkBar.setProgress(Person.drink);
            indDrinkInt.setText(String.valueOf(Person.drink));
            ProgressBar indEatBar = getActivity().findViewById(R.id.indEatBar);
            TextView indEatInt = getActivity().findViewById(R.id.indEatInt);
            indEatBar.setProgress(Person.eat);
            indEatInt.setText(String.valueOf(Person.eat));
            ProgressBar indSleepBar = getActivity().findViewById(R.id.indSleepBar);
            TextView indSleepInt = getActivity().findViewById(R.id.indSleepInt);
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            ProgressBar indBoredBar = getActivity().findViewById(R.id.indBoredBar);
            TextView indBoredInt = getActivity().findViewById(R.id.indBoredInt);
            indBoredBar.setProgress(Person.bored);
            indBoredInt.setText(String.valueOf(Person.bored));
            ProgressBar indToiletBar = getActivity().findViewById(R.id.indToiletBar);
            TextView indToiletInt = getActivity().findViewById(R.id.indToiletInt);
            indToiletBar.setProgress(Person.toilet);
            indToiletInt.setText(String.valueOf(Person.toilet));
            ProgressBar indShowerBar = getActivity().findViewById(R.id.indShowerBar);
            TextView indShowerInt = getActivity().findViewById(R.id.indShowerInt);
            indShowerBar.setProgress(Person.shower);
            indShowerInt.setText(String.valueOf(Person.shower));
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.bg_view_2, container, false);

            // ???????????? ?????????? ???????????????? ???????? ????????????????, ?????????????????????????? ???? ??????????????????
            Button button_sleep = (Button) view.findViewById(R.id.button_sleep);
            Button button_rest = (Button) view.findViewById(R.id.button_rest);
            button_sleep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Person.Sleep();
                    updateInd();
                }
            });
            button_rest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Person.Rest();
                    updateInd();
                }
            });
            return view;
        }
    }

    public static class View3 extends Fragment {

        public void updateInd() {
            ProgressBar indDrinkBar = getActivity().findViewById(R.id.indDrinkBar);
            TextView indDrinkInt = getActivity().findViewById(R.id.indDrinkInt);
            indDrinkBar.setProgress(Person.drink);
            indDrinkInt.setText(String.valueOf(Person.drink));
            ProgressBar indEatBar = getActivity().findViewById(R.id.indEatBar);
            TextView indEatInt = getActivity().findViewById(R.id.indEatInt);
            indEatBar.setProgress(Person.eat);
            indEatInt.setText(String.valueOf(Person.eat));
            ProgressBar indSleepBar = getActivity().findViewById(R.id.indSleepBar);
            TextView indSleepInt = getActivity().findViewById(R.id.indSleepInt);
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            ProgressBar indBoredBar = getActivity().findViewById(R.id.indBoredBar);
            TextView indBoredInt = getActivity().findViewById(R.id.indBoredInt);
            indBoredBar.setProgress(Person.bored);
            indBoredInt.setText(String.valueOf(Person.bored));
            ProgressBar indToiletBar = getActivity().findViewById(R.id.indToiletBar);
            TextView indToiletInt = getActivity().findViewById(R.id.indToiletInt);
            indToiletBar.setProgress(Person.toilet);
            indToiletInt.setText(String.valueOf(Person.toilet));
            ProgressBar indShowerBar = getActivity().findViewById(R.id.indShowerBar);
            TextView indShowerInt = getActivity().findViewById(R.id.indShowerInt);
            indShowerBar.setProgress(Person.shower);
            indShowerInt.setText(String.valueOf(Person.shower));
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.bg_view_3, container, false);

            // ???????????? ?????????? ???????????????? ???????? ????????????????, ?????????????????????????? ???? ??????????????????
            Button button_fun = (Button) view.findViewById(R.id.button_fun);
            Button button_play = (Button) view.findViewById(R.id.button_play);
            button_fun.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Person.Fun();
                    updateInd();
                }
            });
            button_play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    intentToMiniGame = new Intent(view.getContext(), MiniGame.class);
                    Person.Play();
                    updateInd();
                    startActivity(intentToMiniGame);
                }
            });
            return view;
        }
    }


    public static class View4 extends Fragment {

        public void updateInd() {
            ProgressBar indDrinkBar = getActivity().findViewById(R.id.indDrinkBar);
            TextView indDrinkInt = getActivity().findViewById(R.id.indDrinkInt);
            indDrinkBar.setProgress(Person.drink);
            indDrinkInt.setText(String.valueOf(Person.drink));
            ProgressBar indEatBar = getActivity().findViewById(R.id.indEatBar);
            TextView indEatInt = getActivity().findViewById(R.id.indEatInt);
            indEatBar.setProgress(Person.eat);
            indEatInt.setText(String.valueOf(Person.eat));
            ProgressBar indSleepBar = getActivity().findViewById(R.id.indSleepBar);
            TextView indSleepInt = getActivity().findViewById(R.id.indSleepInt);
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            indSleepBar.setProgress(Person.sleep);
            indSleepInt.setText(String.valueOf(Person.sleep));
            ProgressBar indBoredBar = getActivity().findViewById(R.id.indBoredBar);
            TextView indBoredInt = getActivity().findViewById(R.id.indBoredInt);
            indBoredBar.setProgress(Person.bored);
            indBoredInt.setText(String.valueOf(Person.bored));
            ProgressBar indToiletBar = getActivity().findViewById(R.id.indToiletBar);
            TextView indToiletInt = getActivity().findViewById(R.id.indToiletInt);
            indToiletBar.setProgress(Person.toilet);
            indToiletInt.setText(String.valueOf(Person.toilet));
            ProgressBar indShowerBar = getActivity().findViewById(R.id.indShowerBar);
            TextView indShowerInt = getActivity().findViewById(R.id.indShowerInt);
            indShowerBar.setProgress(Person.shower);
            indShowerInt.setText(String.valueOf(Person.shower));
        }

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.bg_view_4, container, false);

            // ???????????? ?????????? ???????????????? ???????? ????????????????, ?????????????????????????? ???? ??????????????????
            Button button_toilet = (Button) view.findViewById(R.id.button_toilet);
            Button button_bath = (Button) view.findViewById(R.id.button_bath);
            button_toilet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Person.GoToToilet();
                    updateInd();
                }
            });
            button_bath.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Person.GoShower();
                    updateInd();
                }
            });
            return view;
        }
    }
}
