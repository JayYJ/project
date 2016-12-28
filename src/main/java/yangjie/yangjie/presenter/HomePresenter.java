package yangjie.yangjie.presenter;

import yangjie.yangjie.view.interfaces.HomeView;

/**
 * Created by WJ on 2016/12/28.
 */

public class HomePresenter {
    private HomeView homeView;

    public void attachView(HomeView homeView){

        this.homeView=homeView;
    }

    public HomeView getHomeView(){
        return homeView;
}

    public void loadData(){


    }
}
