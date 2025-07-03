package com.leonardo.login;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CuacaListModel {
    @SerializedName("main")
    private CuacaMainModel cuacaMainModel;
    @SerializedName("weather")
    private List<CuacaWeatherModel> cuacaModelList;
    private String dt_txt;

    public CuacaMainModel() {
    }

    public CuacaMainModel getMainModel() {
        return CuacaMainModel;
    }

    public void setMainModel(CuacaMainModel mainModel) {
        this.cuacaMainModel = mainModel;
    }

    public List<CuacaWeatherModel> getCuacaModelList() {
        return cuacaModelList;
    }

    public void setCuacaModelList(List<CuacaModel> cuacaModelList) {
        this.cuacaModelList = cuacaModelList;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}
