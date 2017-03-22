package williamHill.betting.ui;

import org.openqa.selenium.By;

/**
 * Created by dbharti on 21/03/2017.
 * This interface contains the CSS accessors of all the elements being used in tests
 */
public interface PlaceBetPageUi {

    public static final String FOOTBALL_LINK_CSS = "#nav-football a";
    public static final String FOOTBALL_LINK_ID_MOBILE = "nav-football";
    public static final String COMPETITIONS_LINK_CSS = "#nav-football-competitions .c-list__item";
    public static final String COMPETITIONS_LINK_CSS_MOBILE = ".navCompetitions a";
    public static final String ENGLISH_PREMIER_LEAGUE_LINK_CSS = "[data-id='Popular-Leagues-OB_TY295']";
    public static final String HOME_TEAM_SELECTION_BTN_CSS = "[data-entityid='OB_OU1494126082']";
    public static final String BET_PRICE_INPUT_BOX_CSS =  ".betslip-selection__stake-container span input";
    public static final String PLACE_BET_BTN_CSS = "#place-bet-button";
    public static final String PLACE_BET_ERROR_CSS = "#place-bet-error span";
    public static final String BET_SLIP_SELECTION_ODDS_CSS = ".betslip-selection__price";
}
