INSERT INTO plc (id, plc_name, plc_token, plc_userid)
VALUES
  (1, 'Primary Treatment Plant Tank 1 (OMRON PLC)', 'Token 1', 1),
  (2, 'Primary Treatment Plant Tank 2 (Siemen PLC)', 'Token 2', 1),
  (3, 'Primary Treatment Plant Tank 3 (Delta PLC)', 'Token 3', 1),
  (4, 'Secondary Treatment Plant Tank 1 (Mitsubushi PLC)', 'Token 4', 1),
  (5, 'Secondary Treatment Plant Tank 2 (ABB PLC)', 'Token 5', 1),
  (6, 'Secondary Treatment Plant Tank 3 (Burkert PLC)', 'Token 6', 1),
  (7, 'Tertiary Treatment Plant Tank 1 (Amsamotion PLC)', 'Token 7', 1),
  (8, 'Tertiary Treatment Plant Tank 2 (HFCA PLC)', 'Token 8', 1),
  (9, 'Tertiary Treatment Plant Tank 3 (Allen Bradley PLC)', 'Token 9', 1),
  (10, 'Advanced Treatment Plant Tank 1 (Schneider PLC)', 'Token 10', 1),
  (11, 'Advanced Treatment Plant Tank 2 (Toshiba PLC)', 'Token 11', 1),
  (12, 'Advanced Treatment Plant Tank 3 (Keyence PLC)', 'Token 12', 1);


INSERT INTO address (id, name, description, plcid)
VALUES
  -- Addresses for PLC with id 1
  (1, '100.00', 'Pressure Alarm', 1),
  (2, '100.01', 'pH Alarm', 1),
  (3, '100.02', 'Temperature Alarm', 1),
  (4, '100.03', 'Level Alarm', 1),
  (5, '100.04', 'Security Alarm', 1),
  (6, '100.05', 'Fire Alarm', 1),
  -- Addresses for PLC with id 2
  (7, 'Address 1', 'Description for Address 1 in PLC 2', 2),
  (8, 'Address 2', 'Description for Address 2 in PLC 2', 2),
  -- Addresses for PLC with id 3
  (9, 'Address 1', 'Description for Address 1 in PLC 3', 3),
  (10, 'Address 2', 'Description for Address 2 in PLC 3', 3),
  -- Addresses for PLC with id 4
  (11, 'Address 1', 'Description for Address 1 in PLC 4', 4),
  (12, 'Address 2', 'Description for Address 2 in PLC 4', 4),
  -- Addresses for PLC with id 5
  (13, 'Address 1', 'Description for Address 1 in PLC 5', 5),
  (14, 'Address 2', 'Description for Address 2 in PLC 5', 5),
  -- Addresses for PLC with id 6
  (15, 'Address 1', 'Description for Address 1 in PLC 6', 6),
  (16, 'Address 2', 'Description for Address 2 in PLC 6', 6),
  -- Addresses for PLC with id 7
  (17, 'Address 1', 'Description for Address 1 in PLC 7', 7),
  (18, 'Address 2', 'Description for Address 2 in PLC 7', 7),
  -- Addresses for PLC with id 8
  (19, 'Address 1', 'Description for Address 1 in PLC 8', 8),
  (20, 'Address 2', 'Description for Address 2 in PLC 8', 8),
  -- Addresses for PLC with id 9
  (21, 'Address 1', 'Description for Address 1 in PLC 9', 9),
  (22, 'Address 2', 'Description for Address 2 in PLC 9', 9),
  -- Addresses for PLC with id 10
  (23, 'Address 1', 'Description for Address 1 in PLC 10', 10),
  (24, 'Address 2', 'Description for Address 2 in PLC 10', 10),
  -- Addresses for PLC with id 11
  (25, 'Address 1', 'Description for Address 1 in PLC 11', 11),
  (26, 'Address 2', 'Description for Address 2 in PLC 11', 11),
  -- Addresses for PLC with id 12
  (27, 'Address 1', 'Description for Address 1 in PLC 12', 12),
  (28, 'Address 2', 'Description for Address 2 in PLC 12', 12);


[
    {
        "id": 1,
        "name": "Primary Treatment Plant Tank 1 (OMRON PLC)",
        "token": "Token 1",
        "userid": 1,
        "addresses": [
            {
                "id": 1,
                "name": "100.00",
                "description": "Pressure Alarm"
            },
            {
                "id": 2,
                "name": "100.01",
                "description": "pH Alarm"
            },
            {
                "id": 3,
                "name": "100.02",
                "description": "Temperature Alarm"
            },
            {
                "id": 4,
                "name": "100.03",
                "description": "Level Alarm"
            },
            {
                "id": 5,
                "name": "100.04",
                "description": "Security Alarm"
            },
            {
                "id": 6,
                "name": "100.05",
                "description": "Fire Alarm"
            }
        ]
    },
    {
        "id": 2,
        "name": "Primary Treatment Plant Tank 2 (Siemen PLC)",
        "token": "Token 2",
        "userid": 1,
        "addresses": [
            {
                "id": 7,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 2"
            },
            {
                "id": 8,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 2"
            }
        ]
    },
    {
        "id": 3,
        "name": "Primary Treatment Plant Tank 3 (Delta PLC)",
        "token": "Token 3",
        "userid": 1,
        "addresses": [
            {
                "id": 9,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 3"
            },
            {
                "id": 10,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 3"
            }
        ]
    },
    {
        "id": 4,
        "name": "Secondary Treatment Plant Tank 1 (Mitsubushi PLC)",
        "token": "Token 4",
        "userid": 1,
        "addresses": [
            {
                "id": 11,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 4"
            },
            {
                "id": 12,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 4"
            }
        ]
    },
    {
        "id": 5,
        "name": "Secondary Treatment Plant Tank 2 (ABB PLC)",
        "token": "Token 5",
        "userid": 1,
        "addresses": [
            {
                "id": 13,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 5"
            },
            {
                "id": 14,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 5"
            }
        ]
    },
    {
        "id": 6,
        "name": "Secondary Treatment Plant Tank 3 (Burkert PLC)",
        "token": "Token 6",
        "userid": 1,
        "addresses": [
            {
                "id": 15,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 6"
            },
            {
                "id": 16,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 6"
            }
        ]
    },
    {
        "id": 7,
        "name": "Tertiary Treatment Plant Tank 1 (Amsamotion PLC)",
        "token": "Token 7",
        "userid": 1,
        "addresses": [
            {
                "id": 17,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 7"
            },
            {
                "id": 18,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 7"
            }
        ]
    },
    {
        "id": 8,
        "name": "Tertiary Treatment Plant Tank 2 (HFCA PLC)",
        "token": "Token 8",
        "userid": 1,
        "addresses": [
            {
                "id": 19,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 8"
            },
            {
                "id": 20,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 8"
            }
        ]
    },
    {
        "id": 9,
        "name": "Tertiary Treatment Plant Tank 3 (Allen Bradley PLC)",
        "token": "Token 9",
        "userid": 1,
        "addresses": [
            {
                "id": 21,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 9"
            },
            {
                "id": 22,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 9"
            }
        ]
    },
    {
        "id": 10,
        "name": "Advanced Treatment Plant Tank 1 (Schneider PLC)",
        "token": "Token 10",
        "userid": 1,
        "addresses": [
            {
                "id": 23,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 10"
            },
            {
                "id": 24,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 10"
            }
        ]
    },
    {
        "id": 11,
        "name": "Advanced Treatment Plant Tank 2 (Toshiba PLC)",
        "token": "Token 11",
        "userid": 1,
        "addresses": [
            {
                "id": 25,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 11"
            },
            {
                "id": 26,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 11"
            }
        ]
    },
    {
        "id": 12,
        "name": "Advanced Treatment Plant Tank 3 (Keyence PLC)",
        "token": "Token 12",
        "userid": 1,
        "addresses": [
            {
                "id": 27,
                "name": "Address 1",
                "description": "Description for Address 1 in PLC 12"
            },
            {
                "id": 28,
                "name": "Address 2",
                "description": "Description for Address 2 in PLC 12"
            }
        ]
    }
]


IOT API how to identify object of Internet?

"token": "Delta",

"userid": 5

"address_name": "0.00"


ONE-TO-ONE

{
    "token": "Delta",
    "userid": 5,
    "address_name": "0.00"
}


ONE-TO-MANY

http://localhost:8089/telegram/alert


{
    "token": "OMRON PLC",
    "userid": 5,
    "address_name": [
        {
            "name": "100.00"
        },
        {
            "name": "100.01"
        }
    ]
}





