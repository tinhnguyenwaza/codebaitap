SELECT Doctor, Professor, Singer, Actor
FROM
    (
    SELECT
        name,
        rownum,
        occ
    FROM
        (
            SELECT
                name AS name,
                row_number() over (PARTITION BY occupation ORDER BY name) AS rownum,
                occupation as occ
            FROM occupations
        ) tab
    ) AS s
    PIVOT
    (
        MIN(name)
        FOR occ IN (Doctor, Professor, Singer, Actor)
    ) AS pvt;