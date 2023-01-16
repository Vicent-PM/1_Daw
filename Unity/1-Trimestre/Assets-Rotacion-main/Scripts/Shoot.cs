using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Shoot : MonoBehaviour
{
    [SerializeField] private GameObject bullet;

    [SerializeField] private Transform spawnPoint;

    [SerializeField] private bool isPlayer;

    [SerializeField] private float coolDown = 1.5f;

    private float counter = 0;
    private bool canShoot = false;

    // Update is called once per frame
    void Update()
    {
        counter += Time.deltaTime;

        if (counter > coolDown)
            canShoot = true;

        if (isPlayer)
        {
            if (Input.GetKeyDown(KeyCode.Space) && canShoot)
            {
                Instantiate(bullet, spawnPoint.position, transform.rotation);
                canShoot = false;
                counter = 0;
            }
        }
        else
        {
            if (canShoot)
            {
                Instantiate(bullet, spawnPoint.position, transform.rotation);
                canShoot = false;
                counter = 0;
            }
        }
    }
}