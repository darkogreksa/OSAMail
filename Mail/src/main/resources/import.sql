INSERT INTO account (account_id, smtp_address, smtp_port, in_server_type, in_server_address, in_server_port, username, password, display_name) VALUES (1, 'smtpAddress1', 1, 1, 'inServerAddress1', 1, 'pera', 'pera', 'pera');
INSERT INTO account (account_id, smtp_address, smtp_port, in_server_type, in_server_address, in_server_port, username, password, display_name) VALUES (2, 'smtpAddress2', 2, 2, 'inServerAddress2', 2, 'zika', 'zika', 'zika');

INSERT INTO contact (contact_id, first_name, last_name, email, display, note) VALUES (1, 'Marko', 'Markovic', 'mare@gmail.com', 'display1', 'note1')
INSERT INTO contact (contact_id, first_name, last_name, email, display, note) VALUES (2, 'Lazar', 'Lazarevic', 'laza@gmail.com', 'display2', 'note2')

INSERT INTO tag (tag_id, name) VALUES (1, 'hitno')
INSERT INTO tag (tag_id, name) VALUES (2, 'vazno')

INSERT INTO folder (folder_id, name, destination, parent_folder, account_id) VALUES (1, "folder1", 0, 0, 1)
INSERT INTO folder (folder_id, name, destination, parent_folder, account_id) VALUES (2, 'Folder2', 0, 0, 2)

INSERT INTO message (message_id, from1, to1, cc, bcc, date_time, subject, content, unread, message_tag, account_id, folder_id) VALUES (1, "From", "To", "Cc", "Bcc", "2019-05-1", "Subject", "Content", false, 1, 1, 1)
INSERT INTO message (message_id, from1, to1, cc, bcc, date_time, subject, content, unread, message_tag, account_id, folder_id) VALUES (2, 'from2', 'to2', 'cc2', 'bcc2', '2019-01-02', 'subject2', 'content2', false, 2, 2, 2)

