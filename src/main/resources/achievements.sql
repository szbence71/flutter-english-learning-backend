INSERT INTO achievement (aid, description, is_true, title, strid)
VALUES (1, 'Lépj be először!', 0, 'Első belépés', 'first_login')
ON DUPLICATE KEY UPDATE aid = aid, description = description, is_true = is_true, title = title, strid = strid;

INSERT INTO achievement (aid, description, is_true, title, strid)
VALUES (2, 'Teljesíts 5 szintet!', 0, 'Nehéz kezdet...', 'play_five')
ON DUPLICATE KEY UPDATE aid = aid, description = description, is_true = is_true, title = title, strid = strid;

INSERT INTO achievement (aid, description, is_true, title, strid)
VALUES (3, 'Teljesíts 50 szintet!', 0, 'Gyakorlat teszi...', 'play_fifty')
ON DUPLICATE KEY UPDATE aid = aid, description = description, is_true = is_true, title = title, strid = strid;