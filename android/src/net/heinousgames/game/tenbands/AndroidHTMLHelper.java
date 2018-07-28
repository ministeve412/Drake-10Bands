package net.heinousgames.game.tenbands;

import com.badlogic.gdx.Gdx;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by stevenhanus on 6/13/18
 */
class AndroidHTMLHelper implements MainClass.HTMLCustomMethods {
    @Override
    public String convertDate(Date date) {
        DateFormat formatter = new SimpleDateFormat("mm:ss:SSS", Locale.US);
        return formatter.format(date);
    }

    @Override
    public boolean canGWTPlayOgg() {
        return true;
    }

    @Override
    public int[] getClientWindowSize() {
        return new int[]{Gdx.graphics.getWidth(), Gdx.graphics.getHeight()};
    }
}
