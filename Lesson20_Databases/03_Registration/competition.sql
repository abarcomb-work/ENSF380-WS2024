/* 
 Each time this file is executed, it will reset the database to the original state defined below.
 You can import this directly in your database by (a) manually entering the first three lines of
 commands form this file, (b) removing the first three lines of commands from this file, and 
 (c) \i 'path_to_file\competition.sql' (with appropriate use of \ or / based on OS).
 */

DROP DATABASE IF EXISTS competition;
CREATE DATABASE competition; 
\c competition


DROP TABLE IF EXISTS STUDIO;
CREATE TABLE STUDIO (
  Name      varchar(25) not null,
  Phone      char(12),
  Address      varchar(25),
  primary key (Name)
);

INSERT INTO STUDIO (Name, Phone, Address)
VALUES
('Music Mastery',  '403-357-4457',  '25 Heron Way NW'),
('Melody Time',  '587-594-7593',  '124 Watford Rise SE'),
('Harmony Inc.',  '403-954-5232',  '68 Cedar Drive NE');


DROP TABLE IF EXISTS TEACHER;
CREATE TABLE TEACHER (
  TeacherID    char(4)  not null,
  LName      varchar(25),
  FName      varchar(25),
  Phone      char(12),
  StudioName    varchar(15),
  primary key (TeacherID),
  foreign key (StudioName) references STUDIO(Name) ON UPDATE CASCADE
);

INSERT INTO TEACHER (TeacherID, LName, FName, Phone, StudioName)
VALUES
('9202',  'Jamison',  'Colin',  '403-345-9879',  'Music Mastery'),
('7834',  'Singh',  'Ivan',  '587-111-2345',  'Melody Time'),
('1274',  'Lee',  'Jasmine',  '403-998-4312',  'Harmony Inc.'),
('6598',  'Steele',  'Amy',  '587-434-1978',  'Music Mastery'),
('0023',  'Estrada',  'Ethan',  '587-744-3485',  'Music Mastery'),
('3405',  'Moore',  'Ravi',  '403-448-2238',  'Harmony Inc.');


DROP TABLE IF EXISTS COMPETITOR;
CREATE TABLE COMPETITOR (
  CompetitorID  char(3)  not null,
  LName      varchar(25),
  FName      varchar(25),
  Age        integer not null,
  Instrument    varchar(15),
  TeacherID    char(4),
  primary key (CompetitorID),
  foreign key (TeacherID) references TEACHER(TeacherID)
);

INSERT INTO COMPETITOR (CompetitorID, LName, FName, Age, Instrument, TeacherID)
VALUES
('001',  'Williams',  'Sophie',  7,  'Flute',  '7834'),
('157',  'Bell',  'Jalal',  14,  'Trombone',  '1274'),
('052',  'Turner',  'Penny',  10,  'Piano',  '7834'),
('188',  'Wong',  'Roy',  11,  'Flute',  '9202'),
('133',  'Sherman',  'Noel',  8,  'Oboe',  '6598'),
('110',  'Torres',  'Parker',  13,  'Piano',  '0023'),
('045',  'Warren',  'Harper',  12,  'Trombone',  '3405'),
('096',  'Madani',  'Amira',  15,  'Oboe',  '1274'),
('205',  'Kamilla',  'Mala',    9,  'Piano',  '7834');

DROP TABLE IF EXISTS COMPOSITION;
CREATE TABLE COMPOSITION (
  MusicID      char(2) not null,
  Title      varchar(50),
  Composer    varchar(25),
  Genre      varchar(15),
  primary key (MusicID)
);

INSERT INTO COMPOSITION(MusicID, Title, Composer, Genre)
VALUES
('C1',  'Symphony No. 5 in C minor',  'Beethoven',  'Classical'),
('C2',  'Concerto for Oboe and Strings',  'Cimarosa',  'Classical'),
('C3',  'Symphony No. 40 in G minor',  'Mozart',  'Classical'),
('B1',  'Suite No. 1 in G major',  'Bach',  'Baroque'),
('B2',  'Canon in D major',  'Pachelbel',  'Baroque'),
('B3',  'Concerto in G major',  'Telemann',  'Baroque'),
('R1',  'Prelude, Op. 28, No. 4',  'Chopin',  'Romantic'),
('R2',  'The Sleeping Beauty, Overture',  'Tchaikovsky',  'Romantic'),
('R3',  'Carmen, Overture',  'Bizet',  'Romantic'),
('M1',  'Childrens March',  'Grainger',  'Modern'),
('M2',  'Jazz Suite No. 2 Waltz',  'de Meij',  'Modern'),
('M3',  'English Folk Songs',  'Vaughan Williams',  'Modern');


DROP TABLE IF EXISTS CATEGORY;
CREATE TABLE CATEGORY (
  CategoryID    char(3)  not null,
  Genre      varchar(15),
  AgeMin      integer,
  AgeMax      integer,
  CompDate    date,
  CompTime    time,
  primary key (CategoryID)
);

INSERT INTO CATEGORY(CategoryID, Genre, AgeMin, AgeMax, CompDate, CompTime)
VALUES
('001',  'Classical',  '5',  '11',  '2020-12-01',  '10:00'),
('002',  'Classical',  '12',  '18',  '2020-12-01',  '13:00'),
('003',  'Romantic',  '5',  '11',  '2020-12-02',  '10:00'),
('004',  'Romantic',  '12',  '18',  '2020-12-02',  '13:00'),
('005',  'Baroque',  '5',  '11',  '2020-12-03',  '10:00'),
('006',  'Baroque',  '12',  '18',  '2020-12-03',  '13:00'),
('007',  'Modern',  '5',  '11',  '2020-12-04',  '10:00'),
('008',  'Modern',  '12',  '18',  '2020-12-04',  '13:00');


DROP TABLE IF EXISTS PERFORMANCE;
CREATE TABLE PERFORMANCE (
  CompetitorID  char(3)  not null,
  CategoryID    char(3) not null,
  MusicID      char(2) not null,
  Score      integer,
  primary key (CompetitorID, CategoryID, MusicID),
  foreign key (CompetitorID) references COMPETITOR(CompetitorID),
  foreign key (CategoryID) references CATEGORY(CategoryID),
  foreign key (MusicID) references COMPOSITION(MusicID)
);

INSERT INTO PERFORMANCE(CompetitorID, CategoryID, MusicID, Score)
VALUES
('001',  '003',  'R1',  '82'),
('157',  '008',  'M3',  '69'),
('052',  '003',  'R1',  '95'),
('188',  '001',  'C1',  '75'),
('133',  '005',  'B2',  '88'),
('110',  '008',  'M2',  '65'),
('045',  '004',  'R2',  '93'),
('096',  '004',  'R2',  '90');

