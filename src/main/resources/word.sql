-- easy
INSERT INTO word (original, translated, hard) 
VALUES ('car', 'kocsi', 0)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('apple', 'alma', 0)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('peach', 'barack', 0)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('new', 'új', 0)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('ló', 'horse', 0)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('cat', 'macska', 0)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('kutya', 'dog', 0)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

-- hard
INSERT INTO word (original, translated, hard) 
VALUES ('acquiesce', 'beleegyezik', 1)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('conundrum', 'rejtvény', 1)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('eloquent', 'kifejező', 1)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('voracious', 'faltató', 1)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('ephemeral', 'mulandó', 1)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard) 
VALUES ('meticulous', 'precíz', 1)
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;
