CREATE TABLE team (
  team_id BIGSERIAL PRIMARY KEY,
  name text UNIQUE NOT NULL,
  nameAbv text UNIQUE NOT NULL,
  byeWeek INT NOT NULL,
  ol_ranking INT
);

CREATE TABLE player (
  player_id BIGSERIAL PRIMARY KEY,
  rank INT,
  name text NOT NULL,
  position text NOT NULL,
  yahooProjectedValue DECIMAL NOT NULL,
  yahooAvgValue DECIMAL NOT NULL,
  fantasyProsValue DECIMAL NOT NULL,
  lastYearTotalPoints DECIMAL NOT NULL,
  team_id BIGSERIAL REFERENCES team
);

CREATE TABLE tag (
  tag_id BIGSERIAL PRIMARY KEY,
  name text NOT NULL
);

CREATE TABLE comment (
  comment_id BIGSERIAL PRIMARY KEY,
  commentText text NOT NULL,
  player_id BIGSERIAL REFERENCES player
);

CREATE TABLE strengthOfSchedule (
  sos_id BIGSERIAL PRIMARY KEY,
  position text NOT NULL,
  rank INT NOT NULL
);


/**
    Inserts for Teams
 */
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Tennessee Titans',	8, 1, 'Ten');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Dallas Cowboys',	6, 2, 'Dal');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Pittsburgh Steelers',	9, 3, 'Pit');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Oakland Raiders',	10, 4, 'Oak');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Green Bay Packers',	8, 5, 'GB');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Atlanta Falcons',	5, 6, 'Atl');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Washington Redskins',	5, 7, 'Was');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Philadelphia Eagles',	10, 8, 'Phi');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Baltimore Ravens',	10, 9, 'Bal');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('New England Patriots',	9, 10, 'NE');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Buffalo Bills',	6, 11, 'Buf');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('New Orleans Saints',	5, 12, 'NO');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Cincinnati Bengals',	6, 13, 'Cin');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Kansas City Chiefs',	10, 14, 'KC');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Chicago Bears',	9, 15, 'Chi');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Cleveland Browns',	9, 16, 'Cle');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Carolina Panthers',	11, 17, 'Car');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Houston Texans',	7, 18, 'Hou');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Detroit Lions',	7, 19, 'Det');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('New York Giants',	8, 20, 'NYG');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('New York Jets',	11, 21, 'NYJ');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Jacksonville Jaguars',	8, 22, 'Jax');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Tampa Bay Buccaneers',	11, 23, 'TB');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Denver Broncos',	5, 24, 'Den');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Indianapolis Colts',	11, 25, 'Ind');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Arizona Cardinals',	8, 26, 'Ari');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Los Angeles Rams',	8, 27, 'LAR');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('San Francisco 49ers',	11, 28, 'SF');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Minnesota Vikings',	9, 29, 'Min');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Miami Dolphins', 11, 30, 'Mia');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Los Angeles Chargers',	9, 31, 'LAC');
INSERT INTO team (name, byeWeek, ol_ranking, nameAbv) VALUES ('Seattle Seahawks',	6, 32, 'Sea');

/**
    Inserts for Tags
 */

INSERT INTO tag (name) VALUES ('Injured');
INSERT INTO tag (name) VALUES ('Suspended');
INSERT INTO tag (name) VALUES ('NB');
INSERT INTO tag (name) VALUES ('Contract Year');
INSERT INTO tag (name) VALUES ('Do not Draft');
INSERT INTO tag (name) VALUES ('Target if good value');



