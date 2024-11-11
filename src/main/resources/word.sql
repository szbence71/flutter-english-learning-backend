-- easy
INSERT INTO word (original, translated, hard, type) 
VALUES ('car', 'kocsi', 0, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('apple', 'alma', 0, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('peach', 'barack', 0, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('new', 'új', 0, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('ló', 'horse', 0, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('cat', 'macska', 0, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('kutya', 'dog', 0, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

-- hard
INSERT INTO word (original, translated, hard, type) 
VALUES ('acquiesce', 'beleegyezik', 1, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('conundrum', 'rejtvény', 1, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('eloquent', 'kifejező', 1, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('voracious', 'faltató', 1, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('ephemeral', 'mulandó', 1, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;

INSERT INTO word (original, translated, hard, type) 
VALUES ('meticulous', 'precíz', 1, 'főnév')
ON DUPLICATE KEY UPDATE original = original, translated = translated, hard = hard;
