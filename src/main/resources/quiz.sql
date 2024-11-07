-- easy
INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mi a fordítása a "car" szónak?', 'kocsi', 0)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mi a fordítása a "car" szónak?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'kocsi')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'alma')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'kutya')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'macska')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

-- Első kérdés
INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('What is the capital of England?', 'London', 0)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'What is the capital of England?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Paris')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'London')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Berlin')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Rome')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

-- Második kérdés
INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('What is the capital of Germany?', 'Berlin', 0)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'What is the capital of Germany?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Paris')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'London')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Berlin')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Rome')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

-- Harmadik kérdés
INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('What is the capital of Italy?', 'Rome', 0)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'What is the capital of Italy?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Paris')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'London')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Berlin')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Rome')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

-- Negyedik kérdés
INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mi a car szó fordítása?', 'kocsi', 0)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mi a car szó fordítása?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'kocsi')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'kenyér')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'alma')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'kutya')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

-- hard
INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mit jelent a(z) "acquiesce" szó?', 'Beleegyezés protestálás nélkül', 1)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mit jelent a(z) "acquiesce" szó?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Erősen vitatkozni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Beleegyezés protestálás nélkül')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Valamit törölni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Valamit hátrahagyni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mit jelent a(z) "conundrum" szó?', 'Zűrös probléma vagy kérdés', 1)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mit jelent a(z) "conundrum" szó?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Olyan rejtvény, aminek nincs megoldása')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Zűrös probléma vagy kérdés')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Egy fajta madár')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Egy matematikai képlet')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mit jelent a(z) "eloquent" szó?', 'Világos és hatékony kifejezés', 1)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mit jelent a(z) "eloquent" szó?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Homályos és zűrzavaros')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Világos és hatékony kifejezés')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Hangosan beszélni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Bonyolult szavakat használni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mit jelent a(z) "voracious" szó?', 'Nagyon erős vágy valamire', 1)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mit jelent a(z) "voracious" szó?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Energiával teli')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Nagyon erős vágy valamire')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Nagyon csendes')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Semmi iránt nem érdeklődni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mit jelent a(z) "ephemeral" szó?', 'Nagyon rövid ideig tartó', 1)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mit jelent a(z) "ephemeral" szó?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Nagyon rövid ideig tartó')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Örökké tartó')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Nagyon lassú')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Érthetetlen')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mit jelent a(z) "meticulous" szó?', 'Nagy figyelmet fordítani a részletekre', 1)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mit jelent a(z) "meticulous" szó?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Nagy figyelmet fordítani a részletekre')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Nagyon gondatlan')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Izgatottnak lenni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Nagyon rendetlennek lenni')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz (question, correct_answer, hard) 
VALUES ('Mit jelent a(z) "ubiquitous" szó?', 'Mindenütt jelen lévő', 1)
ON DUPLICATE KEY UPDATE question = question, correct_answer = correct_answer, hard = hard;

SET @quizId = (SELECT qid FROM quiz WHERE question = 'Mit jelent a(z) "ubiquitous" szó?' LIMIT 1);
INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Mindenütt jelen lévő')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Csak egy helyen található')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Ritka jelenség')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;

INSERT INTO quiz_options (quiz_qid, options) 
VALUES (@quizId, 'Csak a múltban létezett')
ON DUPLICATE KEY UPDATE quiz_qid = @quizId, options = options;