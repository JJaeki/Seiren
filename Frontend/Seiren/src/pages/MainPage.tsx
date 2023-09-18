import React, { useState, useEffect } from 'react';
import styles from './MainPage.module.css';
import danceduck from '../assets/duckdance.gif';
import videoSource from '../assets/night_-_28860 (1080p).mp4';

export default function MainPage() {
  const [rotateX, setRotateX] = useState(0);
  const [rotateY, setRotateY] = useState(0);

  const handleMouseMove = (e) => {
    const mouseX = e.clientX;
    const mouseY = e.clientY;

    const maxAngle = 30;
    const angleX = (mouseY / window.innerHeight) * 2 * maxAngle - maxAngle;
    const angleY = (mouseX / window.innerWidth) * 2 * maxAngle - maxAngle;

    setRotateX(angleX);
    setRotateY(angleY);
  };

  useEffect(() => {
    window.addEventListener('mousemove', handleMouseMove);
    return () => {
      window.removeEventListener('mousemove', handleMouseMove);
    };
  }, []);

  const textStyle = {
    transform: `perspective(4000px) rotateX(${rotateX}deg) rotateY(${rotateY}deg) scale3d(1, 1, 1)`,
  };

  return (
    <div className={styles.mainPageContainer}>
      <video className={styles.videoBackground} autoPlay loop muted>
        <source src={videoSource} type="video/mp4" />
        Your browser does not support the video tag.
      </video>
      <div style={textStyle} className={styles.textContainer}>
        <div className={styles.text}>
          <p className={styles.title}>
            예혰예혰 움직인댱 ㅋㅋㅋ
          </p>
          <p className={styles.subtitle}>
            Full freedom to sound like <br /> anyone in the metaverse
          </p>
        </div>
      </div>
    </div>
  );
}
