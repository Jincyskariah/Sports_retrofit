package com.example.sports_retrofit.Model;

import java.util.List;

public class Sports_categ {


    private List<LeaguesBean> leagues;

    public List<LeaguesBean> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<LeaguesBean> leagues) {
        this.leagues = leagues;
    }

    public static class LeaguesBean {
        /**
         * idLeague : 4328
         * strLeague : English Premier League
         * strSport : Soccer
         * strLeagueAlternate : Premier League
         */

        private String idLeague;
        private String strLeague;
        private String strSport;
        private String strLeagueAlternate;

        public String getIdLeague() {
            return idLeague;
        }

        public void setIdLeague(String idLeague) {
            this.idLeague = idLeague;
        }

        public String getStrLeague() {
            return strLeague;
        }

        public void setStrLeague(String strLeague) {
            this.strLeague = strLeague;
        }

        public String getStrSport() {
            return strSport;
        }

        public void setStrSport(String strSport) {
            this.strSport = strSport;
        }

        public String getStrLeagueAlternate() {
            return strLeagueAlternate;
        }

        public void setStrLeagueAlternate(String strLeagueAlternate) {
            this.strLeagueAlternate = strLeagueAlternate;
        }
    }
}
