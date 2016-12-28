package yangjie.yangjie.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yangjie.yangjie.R;
import yangjie.yangjie.presenter.HomePresenter;
import yangjie.yangjie.view.interfaces.HomeView;

public class MainActivity extends AppCompatActivity implements HomeView{

    private HomePresenter homePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
    }

    private void initDate() {
        homePresenter = new HomePresenter();
        homePresenter.attachView(this);
        homePresenter.loadData();
    }

    @Override

    public void onSuccess() {
    }
}
