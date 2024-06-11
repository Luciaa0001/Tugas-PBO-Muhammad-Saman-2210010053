/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTANIAN_VAR;

public class KomoditasBeras {
    private int luasTanam;
    private int luasPanen;
    private double produktivitas;

    public KomoditasBeras(int luasTanam, int luasPanen, double produktivitas) {
        this.luasTanam = luasTanam;
        this.luasPanen = luasPanen;
        this.produktivitas = produktivitas;
    }

    public int getLuasTanam() {
        return luasTanam;
    }

    public void setLuasTanam(int luasTanam) {
        this.luasTanam = luasTanam;
    }

    public int getLuasPanen() {
        return luasPanen;
    }

    public void setLuasPanen(int luasPanen) {
        this.luasPanen = luasPanen;
    }

    public double getProduktivitas() {
        return produktivitas;
    }

    public void setProduktivitas(double produktivitas) {
        this.produktivitas = produktivitas;
    }
}
