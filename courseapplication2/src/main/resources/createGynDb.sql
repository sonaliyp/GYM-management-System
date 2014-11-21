
CREATE USER 'studentDbUser'@'localhost' IDENTIFIED BY 'spring';
GRANT ALL PRIVILEGES ON studentdb.* TO 'studentDbUser'@'localhost' WITH GRANT OPTION;
SHOW GRANTS FOR 'studentDbUser'@'localhost';

CREATE SCHEMA IF NOT EXISTS `studentdb` ;
USE `studentdb` ;
DROP TABLE IF EXISTS `studentdb`.`student`;
 


CREATE TABLE IF NOT EXISTS `classes` (
  `nameC` varchar(50) NOT NULL,
  `details` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE IF NOT EXISTS `equipment` (
  `equipmentID` int(10) DEFAULT NULL,
  `equipmentName` varchar(40) DEFAULT NULL,
  `equipmentDetails` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `equipment`
--

INSERT INTO `equipment` (`equipmentID`, `equipmentName`, `equipmentDetails`) VALUES
(101, ' COMPOUND EXERCISE ', 'Muscles Worked: Lats, biceps, middle back, lower back.'),
(103, 'BICEPS CURL MACHINE', 'Primary Muscle Group: is for Biceps'),
(104, 'LEG EXTENSION MACHINE', 'Primary Muscle Group: Quadriceps.');

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE IF NOT EXISTS `instructor` (
  `instructorID` int(11) NOT NULL AUTO_INCREMENT,
  `instructorName` varchar(255) NOT NULL,
  `instructorAddress` varchar(255) NOT NULL,
  `instructorCInfo` varchar(255) NOT NULL,
  `price` int(10) NOT NULL,
  `instructorExp` varchar(255) NOT NULL,
  PRIMARY KEY (`instructorID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`instructorID`, `instructorName`, `instructorAddress`, `instructorCInfo`, `price`, `instructorExp`) VALUES
(1, 'Rajesh', 'kale', '123123', 300, '3'),
(2, 'Rajesh', 'Santa clara', '3123', 200, '3');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(45) NOT NULL,
  `age` int(10) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `lastName`, `age`) VALUES
(1, 'phatak', 0000000029),
(2, 'ValidStudent', 0000000025),
(3, 'xc', 0000000034),
(4, 'as', 0000000034),
(5, 'ValidStudent', 0000000025);

-- --------------------------------------------------------

--
-- Table structure for table `timings`
--

CREATE TABLE IF NOT EXISTS `timings` (
  `timeID` int(11) NOT NULL AUTO_INCREMENT,
  `instructorID` int(11) NOT NULL,
  `timename` varchar(255) NOT NULL,
  PRIMARY KEY (`timeID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `timings`
--

INSERT INTO `timings` (`timeID`, `instructorID`, `timename`) VALUES
(1, 1, '1 to 4'),
(2, 1, '6 to 8'),
(3, 2, '1 to 4');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `userID` int(11) NOT NULL AUTO_INCREMENT,
  `emailAddress` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `firstName` varchar(255) NOT NULL,
  `lastName` varchar(255) NOT NULL,
  `city` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `country` varchar(20) NOT NULL,
  `isAdmin` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `emailAddress`, `password`, `firstName`, `lastName`, `city`, `state`, `country`, `isAdmin`) VALUES
(1, 'sonali@gmail', 'abc', 'sonali', 'Pahtak', 'santa clara', 'CA', 'US', 1),
(2, 'e@sd', '123', 'asa', 'sa', 'santa clara ', 'sa', 'sa', 0),
(4, 'e@sd', 'a', 'a', 'as', 'a', 'a', 'a', 0),
(7, 'as@gmail.com', '123', 'sona', 'sd', 'sdf', 'ssd', 'sd', 0),
(11, 'phatak@gmail.com', '12367', 'Sonali', 'phatak', 'santa clara ', 'california', 'USA', 2);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

