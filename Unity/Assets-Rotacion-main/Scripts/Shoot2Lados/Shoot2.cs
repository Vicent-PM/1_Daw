using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Shoot2 : MonoBehaviour
{
    [SerializeField] private GameObject bulletLeft;
    [SerializeField] private GameObject bulletRight;

    [SerializeField] private Transform SpawnPointLeft;

    [SerializeField] private Transform SpawnPointRight;

    private float coolDown = 1.0f;
    private bool canShoot = false;
    private bool shootOtherWay = false;

    private float counter = 0;
    
    // Update is called once per frame
    void Update()
    {
        counter += Time.deltaTime;
        if (counter > coolDown)
            canShoot = true;
        
        if (canShoot)
        {
            if (shootOtherWay)
            {
                Instantiate(bulletLeft, SpawnPointLeft.position, transform.rotation);
                shootOtherWay = false;
            }
            else
            {
                Instantiate(bulletRight, SpawnPointRight.position, transform.rotation);
                shootOtherWay = true;
            }
                
            
            canShoot = false;
            counter = 0;
        }
    }
}
